package ru.gb.inventory.department.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.inventory.department.api.DepartmentDto;
import ru.gb.inventory.department.api.ResourceNotFoundException;
import ru.gb.inventory.department.converters.DepartmentConverter;
import ru.gb.inventory.department.entyties.Department;
import ru.gb.inventory.department.exceptions.DataValidationException;
import ru.gb.inventory.department.services.DepartmentService;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/V1/departments")
public class DepartmentController {
    private final DepartmentService departmentService;
    private final DepartmentConverter departmentConverter;

    @GetMapping
    public Page<DepartmentDto> findAll(@RequestParam(defaultValue = "1", name = "p") int pageIndex,
                                       @RequestParam(name = "titlePart", required = false) String titlePart
    ){
        if(pageIndex < 1){
            pageIndex = 1;
        }
        return departmentService.findAll(pageIndex - 1, 5).map(departmentConverter::entityToDto);
    }

    @GetMapping("/{id}")
    public DepartmentDto findById(@PathVariable Long id){
        Department department = departmentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department id: " + id + " not found"));
        return departmentConverter.entityToDto(department);
    }

    @PostMapping
    public DepartmentDto save(@RequestBody @Validated DepartmentDto departmentDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new DataValidationException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
        }
        Department department = departmentService.createNewDepartment(departmentDto);
        return departmentConverter.entityToDto(department);
    }

    @PutMapping
    public void updateDepartment(@RequestBody DepartmentDto departmentDto){
        departmentService.updateDepartmentFromDto(departmentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        departmentService.deleteById(id);
    }
}

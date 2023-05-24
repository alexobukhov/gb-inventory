package ru.gb.inventory.user.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.gb.inventory.user.api.DepartmentDto;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.converters.UserConverter;
import ru.gb.inventory.user.exceptions.ResourceNotFoundException;
import ru.gb.inventory.user.integrations.DepartmentServiceIntegration;
import ru.gb.inventory.user.services.UserServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;
    private final DepartmentServiceIntegration departmentServiceIntegration;
    private final UserConverter userConverter;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll()
                .stream()
                .map(userConverter::entityToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable Long id) {
        return userConverter.entityToDto(userService.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Юзер с Id:%s - не найден", id))));
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @GetMapping("/test1")
    public List<DepartmentDto> getAllDepartments() {
        return departmentServiceIntegration.getDepartments();
    }

    @GetMapping("/test2/{id}")
    public DepartmentDto getDepartmentById(@PathVariable Long id) {
        return departmentServiceIntegration.getDepartmentById(id);
    }


}

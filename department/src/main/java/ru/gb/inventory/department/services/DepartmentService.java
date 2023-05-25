package ru.gb.inventory.department.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.inventory.department.api.DepartmentDto;
import ru.gb.inventory.department.api.ResourceNotFoundException;
import ru.gb.inventory.department.entyties.Department;
import ru.gb.inventory.department.repositories.DepartmentRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Page<Department> findAll(int pageIndex, int pageSize){
        return departmentRepository.findAll(PageRequest.of(pageIndex, pageSize));
    }

    public Optional<Department> findById(Long id){
        return departmentRepository.findById(id);
    }

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Department createNewDepartment(DepartmentDto departmentDto){
        Department department = new Department();
        department.setTitle(departmentDto.getTitle());
        departmentRepository.save(department);
        return department;
    }

    public void deleteById(Long id){
        departmentRepository.deleteById(id);
    }

    @Transactional
    public void updateDepartmentFromDto(DepartmentDto departmentDto){
        Department department = findById(departmentDto.getId()).orElseThrow(() -> new ResourceNotFoundException("Department id: " + departmentDto.getId() + " not found"));
        department.setTitle(departmentDto.getTitle());
    }
}

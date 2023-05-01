package ru.geekbrains.department-service.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.geekbrains.department-service.DepartmentDto;
import ru.geekbrains.department-service.ResourceNotFoundException;
import ru.geekbrains.department-service.repositories.DepartmentRepository;
import ru.geekbrains.department-service.models.Department;
import ru.geekbrains.department-service.repositories.Specification.DepartmentSpecification;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Page<Department> findAll(Specification<Product> specification, int pageIndex, int pageSize){
        return departmentRepository.findAll(specification, PageRequest.of(pageIndex, pageSize));
    }

    public Specification<Department> createSpecByFilter(String titlePart){
        Specification<Department> specification = Specification.where(null);

        // select d from Department d where true and like &titlePart&
        if(titlePart != null){
            specification = specification.and(DepartmentSpecification.titleLike(titlePart));
        }
        return specification;
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
        Department department = findById(departmentDto.getId()).orElseThrow(() -> new ResourceNotFoundException("Department id: " + productDto.getId() + " not found"));
        department.setTitle(departmentDto.getTitle());
    }
}

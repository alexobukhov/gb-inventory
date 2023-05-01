package ru.geekbrains.department-service.converters;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.geekbrains.D_market.api.ProductDto;
import ru.geekbrains.D_market.api.ResourceNotFoundException;
import ru.geekbrains.D_market.core.models.Category;
import ru.geekbrains.D_market.core.models.Product;
import ru.geekbrains.D_market.core.services.CategoryService;

@Component
@AllArgsConstructor
public class DepartmentConverter {

    public DepartmentDto entityToDto(Department department){
        return new DepartmentDto(department.getId(), department.getTitle());
    }

    public Department dtoToEntity(DepartmentDto departmentDto){
        Department department = new Department();
        department.setId(departmentDto.getId());
        department.setTitle(departmentDto.getTitle());
        return department;
    }
}

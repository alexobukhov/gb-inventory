package ru.gb.inventory.department.converters;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.gb.inventory.department.api.DepartmentDto;
import ru.gb.inventory.department.api.ResourceNotFoundException;
import ru.gb.inventory.department.entyties.Department;

@Component
@AllArgsConstructor
public class DepartmentConverter {
//    private final UserService userService;

    public DepartmentDto entityToDto(Department department){
        return new DepartmentDto(department.getId(), department.getTitle() /*, department.getUser().getId()*/);
    }

    public Department dtoToEntity(DepartmentDto departmentDto){
        Department department = new Department();
        department.setId(departmentDto.getId());
        department.setTitle(departmentDto.getTitle());
//        User user = userService.findByTitle(departmentDto.getTitle()).orElseThrow(() -> new ResourceNotFoundException("Пользователь не найден"));
//        department.setUser(user);
        return department;
    }
}

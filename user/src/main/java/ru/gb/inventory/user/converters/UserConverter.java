package ru.gb.inventory.user.converters;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.gb.inventory.department.services.DepartmentService;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.entities.User;
import ru.gb.inventory.user.integrations.JobServiceIntegration;

@Component
@AllArgsConstructor

public class UserConverter {

     private final JobServiceIntegration jobService;
     private final DepartmentService departmentService;


    public UserDto entityToDto(User user) {
        return new UserDto(user.getId(), user.getUsername(), user.getEmail(), /*user.getJob().getTitle(),*/ user.getDepartment().getTitle());
    }

    public User dtoToEntity(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        return user;
    }


}

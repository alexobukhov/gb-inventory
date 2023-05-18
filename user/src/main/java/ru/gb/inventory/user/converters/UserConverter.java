package ru.gb.inventory.user.converters;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.entities.User;

@Component
@AllArgsConstructor

public class UserConverter {

    //    private final JobService jobService;
    //    private final DepartmentService departmentService;


    public UserDto entityToDto(User user) {
        return new UserDto(user.getId(), user.getUsername(), user.getEmail() /* user.getJob().getTitle(), user.getDepartment()getTitle() */);
    }


}

package ru.gb.inventory.user.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.converters.UserConverter;
import ru.gb.inventory.user.exceptions.ResourceNotFoundException;
import ru.gb.inventory.user.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserConverter userConverter;

    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable Long id) {
        return userConverter.entityToDto(userService.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Юзер с Id:%s - не найден", id))));
    }
}

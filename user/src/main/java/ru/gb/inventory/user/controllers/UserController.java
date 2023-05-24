package ru.gb.inventory.user.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.inventory.department.api.ResourceNotFoundException;

import ru.gb.inventory.department.exceptions.DataValidationException;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.converters.UserConverter;
import ru.gb.inventory.user.entities.User;
import ru.gb.inventory.user.integrations.DepartmentServiceIntegration;
import ru.gb.inventory.user.integrations.JobServiceIntegration;
import ru.gb.inventory.user.services.UserServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/V1/user")

public class UserController {
    private final UserServiceImpl userService;
    private final UserConverter userConverter;
    private final DepartmentServiceIntegration departmentServiceIntegration;
    private final JobServiceIntegration jobServiceIntegration;

    @GetMapping

    public List<UserDto> findAll() {
        return userService.findAll()
                .stream()
                .map(userConverter::entityToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id) {
        return userConverter.entityToDto(userService.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("User with id:is not found", id))));
    }

    @GetMapping("/{username}")
    public UserDto findByUserName(@PathVariable String username) {
        return userConverter.entityToDto(userService.findByUserName(username).orElseThrow(() -> new ResourceNotFoundException(String.format("User with username:is not found", username))));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewUser(@RequestBody UserDto userDto) {
        userService.addNewUser(userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
    }







}

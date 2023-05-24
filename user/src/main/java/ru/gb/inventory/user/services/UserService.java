package ru.gb.inventory.user.services;

import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByUserName(String username);


    void deleteById(Long id);


    void addNewUser(UserDto userDto);

}

package ru.gb.inventory.user.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.inventory.user.entities.User;
import ru.gb.inventory.user.repositories.UserRepositoty;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    @Autowired
    private final UserRepositoty userRepository;

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

}
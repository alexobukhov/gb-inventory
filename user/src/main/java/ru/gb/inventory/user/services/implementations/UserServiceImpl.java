package ru.gb.inventory.user.services.implementations;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.converters.UserConverter;
import ru.gb.inventory.user.entities.User;
import ru.gb.inventory.user.repositories.UserRepository;
import ru.gb.inventory.user.services.UserService;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public void save(UserDto userDto) {
        userRepository.save(userConverter.dtoToEntity(userDto));
    }


}
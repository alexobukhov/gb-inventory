package ru.gb.inventory.user.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.inventory.department.api.ResourceNotFoundException;
import ru.gb.inventory.user.api.UserDto;
import ru.gb.inventory.user.entities.User;
import ru.gb.inventory.user.repositories.UserRepositoty;

import java.util.List;
import java.util.Optional;



@Service
@RequiredArgsConstructor
@Slf4j

public abstract class UserServiceImpl implements UserService {

    private final UserRepositoty userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public void addNewUser(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        userRepository.save(user);

    }

    @Override
    public Optional<User> findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    public void updateUserFromDto(UserDto userDto){
        User user = findById(userDto.getId()).orElseThrow(() -> new ResourceNotFoundException("User id: " + userDto.getId() + " not found"));
        user.setUsername(userDto.getUsername());
    }
}
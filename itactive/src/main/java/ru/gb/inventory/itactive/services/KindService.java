package ru.gb.inventory.itactive.services;

import ru.gb.inventory.itactive.dto.KindDto;
import ru.gb.inventory.itactive.entities.Kind;

import java.util.List;
import java.util.Optional;

public interface KindService {

    List<Kind> findAll();

    void addNewKind(KindDto kindDto);

    Optional<Kind> findById(Long id);

//    Optional<Kind> findByTitle(String title);

    void deleteById(Long id);

//    void deleteByTitle(String title);

}
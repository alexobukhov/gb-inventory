package ru.gb.inventory.itactive.services;

import ru.gb.inventory.itactive.dto.ProducerDto;
import ru.gb.inventory.itactive.entities.Producer;

import java.util.List;
import java.util.Optional;


public interface ProducerService {

//    Optional<Producer> findByTitle(String title);

    Optional<Producer> findById(Long id);

    List<Producer> findAll();

    void addNewProducer(ProducerDto producerDto);

//    void deleteByTitle(String title);

    void deleteById(Long id);

}

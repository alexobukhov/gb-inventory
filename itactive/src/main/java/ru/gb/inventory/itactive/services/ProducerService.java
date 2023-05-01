package ru.gb.inventory.itactive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.itactive.entities.Producer;
import ru.gb.inventory.itactive.repositories.ProducerRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProducerService {
    private final ProducerRepository producerRepository;

    public Optional<Producer> findByTitle(String title) {
        return producerRepository.findByTitle(title);
    }
}

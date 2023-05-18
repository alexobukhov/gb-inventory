package ru.gb.inventory.itactive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.itactive.dto.ProducerDto;
import ru.gb.inventory.itactive.entities.Producer;
import ru.gb.inventory.itactive.repositories.ProducerRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {
    private final ProducerRepository producerRepository;

    @Override
    public Optional<Producer> findById(Long id) {
        return producerRepository.findById(id);
    }

    @Override
    public List<Producer> findAll() {
        return producerRepository.findAll();
    }

    public void addNewProducer(ProducerDto producerDto) {
        Producer producer = new Producer();
        producer.setTitle(producerDto.getTitle());
        producerRepository.save(producer);
    }

    @Override
    public void deleteById(Long id) {
        producerRepository.deleteById(id);
    }
}

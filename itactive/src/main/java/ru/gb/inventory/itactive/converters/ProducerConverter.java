package ru.gb.inventory.itactive.converters;

import org.springframework.stereotype.Component;
import ru.gb.inventory.itactive.dto.ProducerDto;
import ru.gb.inventory.itactive.entities.Producer;

@Component
public class ProducerConverter {

    public ProducerDto entityToDto(Producer producer) {
        return new ProducerDto(producer.getId(), producer.getTitle());
    }
    public Producer dtoToEntity(ProducerDto producerDto) {
        Producer producer = new Producer();
        producer.setId(producerDto.getId());
        producer.setTitle(producerDto.getTitle());
        return producer;
    }
}

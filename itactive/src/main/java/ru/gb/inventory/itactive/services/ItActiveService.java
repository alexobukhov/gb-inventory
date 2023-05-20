package ru.gb.inventory.itactive.services;

import ru.gb.inventory.itactive.dto.ConditionDto;
import ru.gb.inventory.itactive.dto.ItActiveDto;
import ru.gb.inventory.itactive.dto.KindDto;
import ru.gb.inventory.itactive.dto.ProducerDto;
import ru.gb.inventory.itactive.entities.ItActive;

import java.util.List;
import java.util.Optional;

public interface ItActiveService {

    void deleteById(Long id);

    void addNewItActive(ItActiveDto itActiveDto);

    void changeCondition(Long id, ConditionDto conditionDto);

    void changeDescription(Long id, String description);

    void changeOwner(Long id, Long ownerId);

    void changeKind(Long id, KindDto kindDto);

    void changeProducer(Long id, ProducerDto producerDto);

    void changeModel(Long id, String model);

    void changeSerialNumber(Long id, String serialNumber);

    void changeInventoryNumber(Long id, String inventoryNumber);

    List<ItActive> findAll();

    Optional<ItActive> findById(Long id);

    Optional<ItActive> findBySerialNumber(String serialNumber);

    Optional<ItActive> findByInventoryNumber(String inventoryNumber);

    List<ItActive> findAllByOwner(Long ownerId);


}

package ru.gb.inventory.itactive.services.implementations;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.itactive.converters.ConditionConverter;
import ru.gb.inventory.itactive.converters.KindConverter;
import ru.gb.inventory.itactive.converters.ProducerConverter;
import ru.gb.inventory.itactive.dto.ConditionDto;
import ru.gb.inventory.itactive.dto.ItActiveDto;
import ru.gb.inventory.itactive.dto.KindDto;
import ru.gb.inventory.itactive.dto.ProducerDto;
import ru.gb.inventory.itactive.entities.ItActive;
import ru.gb.inventory.itactive.exceptions.ResourceNotFoundException;
import ru.gb.inventory.itactive.repositories.ItActiveRepository;
import ru.gb.inventory.itactive.services.ItActiveService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItActiveServiceImpl implements ItActiveService {

    private final ItActiveRepository itActiveRepository;
    private final ConditionConverter conditionConverter;
    private final KindConverter kindConverter;
    private final ProducerConverter producerConverter;

    @Override
    public void deleteById(Long id) {
        itActiveRepository.deleteById(id);
    }

    @Override
    public void addNewItActive(ItActiveDto itActiveDto) {
        ItActive itActive = new ItActive();
        itActive.setOwnerId(itActiveDto.getOwner().getId());
        itActive.setKind(itActiveDto.getKind());
        itActive.setProducer(itActiveDto.getProducer());
        itActive.setModel(itActiveDto.getModel());
        itActive.setSerialNumber(itActiveDto.getSerialNumber());
        itActive.setCondition(itActiveDto.getCondition());
        itActive.setDescription(itActiveDto.getDescription());
    }

    @Override
    public void changeCondition(Long id, ConditionDto conditionDto) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setCondition(conditionConverter.dtoToEntity(conditionDto));
    }

    @Override
    public void changeDescription(Long id, String description) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setDescription(description);
    }

    @Override
    public void changeOwner(Long id, Long ownerId) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setOwnerId(ownerId);

    }

    @Override
    public void changeKind(Long id, KindDto kindDto) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setKind(kindConverter.dtoToEntity(kindDto));
    }

    @Override
    public void changeProducer(Long id, ProducerDto producerDto) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setProducer(producerConverter.dtoToEntity(producerDto));
    }

    @Override
    public void changeModel(Long id, String model) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setModel(model);
    }

    @Override
    public void changeSerialNumber(Long id, String serialNumber) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setSerialNumber(serialNumber);
    }

    @Override
    public void changeInventoryNumber(Long id, String inventoryNumber) {
        ItActive itActive = itActiveRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ItActive with Id " + id + " not found"));
        itActive.setInventoryNumber(inventoryNumber);
    }

    @Override
    public List<ItActive> findAll() {
        return itActiveRepository.findAll();
    }

    @Override
    public Optional<ItActive> findById(Long id) {
        return itActiveRepository.findById(id);
    }

    @Override
    public Optional<ItActive> findBySerialNumber(String serialNumber) {
        return itActiveRepository.findBySerialNumber(serialNumber);
    }

    @Override
    public Optional<ItActive> findByInventoryNumber(String inventoryNumber) {
        return itActiveRepository.findByInventoryNumber(inventoryNumber);
    }

    @Override
    public List<ItActive> findAllByOwner(Long ownerId) {
        return itActiveRepository.findAllByOwnerId(ownerId);
    }
}

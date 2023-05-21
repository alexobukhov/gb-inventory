package ru.gb.inventory.itactive.converters;

import org.springframework.stereotype.Component;
import ru.gb.inventory.itactive.dto.ItActiveDto;
import ru.gb.inventory.itactive.entities.ItActive;

@Component
public class ItActiveConverter {

    public ItActiveDto entityToDto(ItActive itActive) {
        return new ItActiveDto(itActive.getId(), itActive.getOwnerId(), itActive.getKind(), itActive.getProducer(), itActive.getModel(), itActive.getSerialNumber(), itActive.getInventoryNumber(), itActive.getCondition(), itActive.getDescription());
    }

    public ItActive dtoToEntity(ItActiveDto itActiveDto) {
        ItActive itActive = new ItActive();
        itActive.setId(itActiveDto.getId());
        itActive.setOwnerId(itActiveDto.getOwner());
        itActive.setKind(itActiveDto.getKind());
        itActive.setProducer(itActiveDto.getProducer());
        itActive.setModel(itActiveDto.getModel());
        itActive.setSerialNumber(itActiveDto.getSerialNumber());
        itActive.setInventoryNumber(itActiveDto.getInventoryNumber());
        itActive.setCondition(itActiveDto.getCondition());
        itActive.setDescription(itActiveDto.getDescription());
        return itActive;
    }

}

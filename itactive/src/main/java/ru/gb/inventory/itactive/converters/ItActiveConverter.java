package ru.gb.inventory.itactive.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.gb.inventory.itactive.dto.ItActiveDto;
import ru.gb.inventory.itactive.entities.ItActive;
import ru.gb.inventory.itactive.integrations.UserServiceIntegration;

@Component
@RequiredArgsConstructor
public class ItActiveConverter {

    private final UserServiceIntegration userServiceIntegration;

    public ItActiveDto entityToDto(ItActive itActive) {
       return new ItActiveDto(
               itActive.getId(),
               userServiceIntegration.findUserById(itActive.getOwnerId()),
               itActive.getKind(),
               itActive.getProducer(),
               itActive.getModel(),
               itActive.getSerialNumber(),
               itActive.getInventoryNumber(),
               itActive.getCondition(),
               itActive.getDescription()
       );

    }

    public ItActive dtoToEntity(ItActiveDto itActiveDto) {
        ItActive itActive = new ItActive();
        itActive.setId(itActiveDto.getId());
        itActive.setOwnerId(itActiveDto.getOwner().getId());
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

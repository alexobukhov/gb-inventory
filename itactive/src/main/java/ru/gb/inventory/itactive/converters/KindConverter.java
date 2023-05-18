package ru.gb.inventory.itactive.converters;

import org.springframework.stereotype.Component;
import ru.gb.inventory.itactive.dto.KindDto;
import ru.gb.inventory.itactive.entities.Kind;

@Component
public class KindConverter {

    public KindDto entityToDto(Kind kind) {
        return new KindDto(kind.getId(), kind.getTitle());
    }

    public Kind dtoToEntity(KindDto kindDto) {
        Kind kind = new Kind();
        kind.setTitle(kindDto.getTitle());
        kind.setId(kindDto.getId());
        return kind;
    }

}

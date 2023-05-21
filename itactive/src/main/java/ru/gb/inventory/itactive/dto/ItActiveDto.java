package ru.gb.inventory.itactive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.inventory.itactive.entities.Condition;
import ru.gb.inventory.itactive.entities.Kind;
import ru.gb.inventory.itactive.entities.Producer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItActiveDto {

    private Long id;

    private Long owner;

    private Kind kind;

    private Producer producer;

    private String model;

    private String serialNumber;

    private String inventoryNumber;

    private Condition condition;

    private String description;
}
package ru.gb.inventory.itactive.dto;

import ru.gb.inventory.itactive.entities.Condition;
import ru.gb.inventory.itactive.entities.Kind;
import ru.gb.inventory.itactive.entities.Producer;

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


    public ItActiveDto() {

    }

    public ItActiveDto(Long id, Long owner, Kind kind, Producer producer, String model, String serialNumber, String inventoryNumber, Condition condition, String description) {
        this.id = id;
        this.owner = owner;
        this.kind = kind;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
        this.inventoryNumber = inventoryNumber;
        this.condition = condition;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

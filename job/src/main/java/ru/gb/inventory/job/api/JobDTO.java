package ru.gb.inventory.job.api;

import jakarta.persistence.Column;

public class JobDTO {

    Long id;
    Long depId;
    String title;
    String description;

    public JobDTO(Long id, Long depId, String title, String description) {
        this.id = id;
        this.depId = depId;
        this.title = title;
        this.description = description;
    }

    public JobDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

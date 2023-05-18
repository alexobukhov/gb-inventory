package ru.gb.inventory.itactive.dto;

public class KindDto {
    private Long id;

    private String title;

    public KindDto() {

    }

    public KindDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

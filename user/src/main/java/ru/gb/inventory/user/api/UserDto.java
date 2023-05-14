package ru.gb.inventory.user.api;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class UserDto{

    @Schema(description = "ID пользователя", required = true, example = "1")
    private Long id;
    @Schema(description = "ФИО", required = true, example = "Иванов И.И.")
    private String username;
    @Schema(description = "e-mail", required = true, example = "IvanovII@gmail.com")
    private String email;
    @Schema(description = "Должность", required = false, example = "Директор")
    private String jobTitle;
    @Schema(description = "Подразделение", required = false, example = "Top management")
    private String departmentTitle;

    public UserDto() {
    }

    public UserDto(Long id, String username, String email, String jobTitle, String departmentTitle) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.jobTitle = jobTitle;
        this.departmentTitle = departmentTitle;

    }

    public UserDto(Long id, String username, /*, String jobTitle, String departmentTitle, */ String email) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   /* public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }









}

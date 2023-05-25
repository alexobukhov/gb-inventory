package ru.gb.inventory.user.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor


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


    public UserDto(Long id, String username, String email, String title) {
    }
}

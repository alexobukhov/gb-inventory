package ru.gb.inventory.job.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDto {

    Long id;

    Long depId;

    String title;

    String description;

}

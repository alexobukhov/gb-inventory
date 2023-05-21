package ru.gb.inventory.itactive.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.inventory.itactive.converters.ItActiveConverter;
import ru.gb.inventory.itactive.dto.ItActiveDto;
import ru.gb.inventory.itactive.services.ItActiveServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/ItActivities")
@RequiredArgsConstructor
public class ItActiveController {

    private final ItActiveServiceImpl itActiveService;
    private final ItActiveConverter itActiveConverter;

    @GetMapping
    public List<ItActiveDto> findAll() {
        return itActiveService.findAll()
                .stream()
                .map(itActiveConverter::entityToDto)
                .collect(Collectors.toList());
    }

}

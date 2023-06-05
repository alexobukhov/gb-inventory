package ru.gb.inventory.job.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.gb.inventory.job.api.JobDto;
import ru.gb.inventory.job.converters.JobConverter;
import ru.gb.inventory.job.exceptions.ResourceNotFoundException;
import ru.gb.inventory.job.services.JobServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/job")
@RequiredArgsConstructor
public class JobController {

    private final JobServiceImpl jobService;
    private final JobConverter jobConverter;

    @GetMapping
    public List<JobDto> findAll() {
        return jobService.findAll()
                .stream()
                .map(jobConverter::entityToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public JobDto findById(@PathVariable Long id) {
        return jobConverter.entityToDto(jobService.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Работа с id:%s не найдена", id))));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewJob(@RequestBody JobDto jobDto) {
        jobService.addNewJob(jobDto);
    }

    @DeleteMapping("/{id}")
    public void deleteJobById(@PathVariable Long id) {
        jobService.deleteById(id);
    }

}

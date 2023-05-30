package ru.gb.inventory.job.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.inventory.job.api.JobDTO;
import ru.gb.inventory.job.services.JobService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/jobs")
public class JobController {

    private final JobService jobService;

    @GetMapping
    public List<JobDTO> findAll(){
        return jobService.findAll();
    }

    @GetMapping("/{id}")
    public JobDTO findById(@PathVariable Long id){
        Optional<JobDTO> job = jobService.findById(id); //.orElseThrow(() -> new ResourceNotFoundException("Job id: " + id + " not found"));
        return job.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        jobService.deleteById(id);
    }

    @PostMapping
    public JobDTO save(@RequestBody @Validated JobDTO jobDTO, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            throw new DataValidationException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
//        }
        return jobService.createJob(jobDTO);
    }

//    @PutMapping
//    public void updateDepartment(@RequestBody JobDTO jobDTO){
//        jobService.updateFromDto(jobDTO);
//    }

}

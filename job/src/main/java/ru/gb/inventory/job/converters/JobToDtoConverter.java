package ru.gb.inventory.job.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gb.inventory.job.api.JobDTO;
import ru.gb.inventory.job.entities.Job;

@Component
public class JobToDtoConverter {
    //@Autowired UserService userService;

    public JobDTO jobToDto(Job job) {
        return new JobDTO(job.getId(), job.getDepId(), job.getTitle(), job.getDescription());
    }

    public Job dtoToJob(JobDTO jobDTO) {
        return new Job(jobDTO.getId(), jobDTO.getDepId(), jobDTO.getTitle(), jobDTO.getDescription());
    }
}

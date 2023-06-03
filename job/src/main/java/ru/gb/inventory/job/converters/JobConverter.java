package ru.gb.inventory.job.converters;

import org.springframework.stereotype.Component;
import ru.gb.inventory.job.api.JobDto;
import ru.gb.inventory.job.entities.Job;

@Component
public class JobConverter {

    public JobDto entityToDto(Job job) {
        return new JobDto(job.getId(), job.getDepId(), job.getTitle(), job.getDescription());
    }

    public Job dtoToEntity(JobDto jobDTO) {
        Job job = new Job();
        job.setDescription(jobDTO.getDescription());
        job.setId(jobDTO.getId());
        job.setDepId(jobDTO.getDepId());
        job.setTitle(jobDTO.getTitle());
        return job;
    }
}

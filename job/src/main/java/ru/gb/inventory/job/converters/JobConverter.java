package ru.gb.inventory.job.converters;

import org.springframework.stereotype.Component;
import ru.gb.inventory.job.api.JobDto;
import ru.gb.inventory.job.entities.Job;

import java.util.Optional;

@Component
public class JobConverter {

    public static JobDto jobToDto(Optional<Job> job) {
        return new JobDto(job.get().getId(),
                job.get().getDepId(),
                job.get().getTitle(),
                job.get().getDescription());
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

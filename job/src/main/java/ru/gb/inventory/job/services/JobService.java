package ru.gb.inventory.job.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.inventory.job.converters.JobToDtoConverter;
import ru.gb.inventory.job.repositories.JobRepository;

@Service
public class JobService {

    private JobRepository jobRepository;
    private JobToDtoConverter jobToDtoConverter;

    @Autowired
    public void setJobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Autowired
    public void setJobToDtoConverter(JobToDtoConverter jobToDtoConverter) {
        this.jobToDtoConverter = jobToDtoConverter;
    }

}

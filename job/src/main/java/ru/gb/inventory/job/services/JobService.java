package ru.gb.inventory.job.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.job.api.JobDTO;
import ru.gb.inventory.job.converters.JobToDtoConverter;
import ru.gb.inventory.job.entities.Job;
import ru.gb.inventory.job.repositories.JobRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;
    private final JobToDtoConverter jobToDtoConverter;

    public List<JobDTO> findAll() {
        return jobRepository.findAll()
                .stream()
                .map(jobToDtoConverter::jobToDto)
                .collect(Collectors.toList());
    }

    public Optional<JobDTO> findById(Long id){
        return jobRepository.findById(id).map(jobToDtoConverter::jobToDto);
    }

    public Job save(JobDTO jobDTO){
        return jobRepository.save(jobToDtoConverter.dtoToJob(jobDTO));
    }

    public void deleteById(Long id){
        jobRepository.deleteById(id);
    }

    public JobDTO createJob(JobDTO jobDTO) {
        Job job = new JobToDtoConverter().dtoToJob(jobDTO);
        jobRepository.save(job);
        return jobToDtoConverter.jobToDto(job);
    }

}

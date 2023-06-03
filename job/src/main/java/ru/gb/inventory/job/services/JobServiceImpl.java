package ru.gb.inventory.job.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.inventory.job.api.JobDto;
import ru.gb.inventory.job.converters.JobConverter;
import ru.gb.inventory.job.entities.Job;
import ru.gb.inventory.job.repositories.JobRepository;
import ru.gb.inventory.job.services.implementations.JobService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;
    private final JobConverter jobConverter;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }

    @Override
    public void addNewJob(JobDto jobDto) {
        Job job = new Job();
        job.setTitle(jobDto.getTitle());
        job.setDepId(jobDto.getDepId());
        job.setDescription(jobDto.getDescription());
        jobRepository.save(job);
    }

    @Override
    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }
}

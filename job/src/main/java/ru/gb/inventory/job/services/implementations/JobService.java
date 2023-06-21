package ru.gb.inventory.job.services.implementations;

/*import ru.gb.inventory.job.api.JobDto;*/
import ru.gb.inventory.job.entities.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {

    List<Job> findAll();

    Optional<Job> findById(Long id);

    /*void addNewJob(JobDto jobDto);*/

    void deleteById(Long id);
}

package ru.gb.inventory.job.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.inventory.job.entities.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {

}

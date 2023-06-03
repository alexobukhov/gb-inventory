package ru.gb.inventory.job.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.inventory.job.entities.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}

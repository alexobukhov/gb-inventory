package ru.gb.inventory.itactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.gb.inventory.itactive.entities.Producer;

import java.util.Optional;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long>, JpaSpecificationExecutor<Producer> {

    Optional<Producer> findByTitle(String title);
}

package ru.gb.inventory.itactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.gb.inventory.itactive.entities.Kind;

import java.util.Optional;

public interface KindRepository extends JpaRepository<Kind, Long>, JpaSpecificationExecutor<Kind> {

    Optional<Kind> findByTitle(String title);

    void deleteByTitle(String title);
}

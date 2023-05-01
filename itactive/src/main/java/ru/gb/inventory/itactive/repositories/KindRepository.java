package ru.gb.inventory.itactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.gb.inventory.itactive.entities.Kind;

public interface KindRepository extends JpaRepository<Kind, Long>, JpaSpecificationExecutor<Kind> {
}

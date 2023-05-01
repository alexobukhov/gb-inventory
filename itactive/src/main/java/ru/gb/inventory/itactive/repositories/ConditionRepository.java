package ru.gb.inventory.itactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.gb.inventory.itactive.entities.Condition;

public interface ConditionRepository extends JpaRepository<Condition, Long>, JpaSpecificationExecutor<Condition> {
}

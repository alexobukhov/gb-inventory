package ru.gb.inventory.itactive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.gb.inventory.itactive.entities.ItActive;

import java.util.List;
import java.util.Optional;

public interface ItActiveRepository extends JpaRepository<ItActive, Long>, JpaSpecificationExecutor<ItActive> {

    Optional<ItActive> findBySerialNumber(String serialNumber);

    Optional<ItActive> findByInventoryNumber(String inventoryNumber);

    List<ItActive> findAllByOwnerId(Long ownerId);
}

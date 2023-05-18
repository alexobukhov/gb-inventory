package ru.gb.inventory.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.gb.inventory.user.entities.User;


@Repository
public interface UserRepositoty extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}
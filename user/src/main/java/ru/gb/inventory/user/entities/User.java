package ru.gb.inventory.user.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import ru.gb.inventory.department.api.DepartmentDto;
import ru.gb.inventory.department.entyties.Department;


@Entity
@Table(name = "user")
@NoArgsConstructor
@Data


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

   /* @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_job")
    private Job job;*/


    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department;

    @Column(name = "email")
    private String email;



}

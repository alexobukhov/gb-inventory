package ru.gb.inventory.user.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



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


   /* @ManyToOne
    @JoinColumn(name = "id_job")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department;*/

    @Column(name = "email")
    private String email;



}

package ru.gb.inventory.itactive.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "producers")
@NoArgsConstructor
@Data
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "producer")
    private List<ItActive> itActives;
}

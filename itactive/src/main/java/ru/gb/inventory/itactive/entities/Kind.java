package ru.gb.inventory.itactive.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Kinds")
@NoArgsConstructor
@Data
public class Kind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "kind")
    private List<ItActive> itActives;

}

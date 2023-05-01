package ru.gb.inventory.itactive.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "actives")
@NoArgsConstructor
@Data
public class ItActive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "owner")
    private Long owner;

    @ManyToOne
    @JoinColumn(name = "kind_id")
    private Kind kind;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @Column(name = "model")
    private String model;

    @Column(name = "serialNumber")
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "condition_id")
    private Condition condition;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;



}

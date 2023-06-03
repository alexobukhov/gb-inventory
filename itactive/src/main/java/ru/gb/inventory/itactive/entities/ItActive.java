package ru.gb.inventory.itactive.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "kind_id")
    private Kind kind;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "condition_id")
    private Condition condition;

    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "description")
    private String description;

    @Column(name = "model")
    private String model;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "inventory_number")
    private String inventoryNumber;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}

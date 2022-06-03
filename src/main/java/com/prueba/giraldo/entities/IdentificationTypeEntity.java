package com.prueba.giraldo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "identification_type")
public class IdentificationTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identification_type")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}

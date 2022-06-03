package com.prueba.giraldo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "work_area")
public class WorkAreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_work_area")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}

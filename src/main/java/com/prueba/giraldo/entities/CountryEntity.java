package com.prueba.giraldo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;
}

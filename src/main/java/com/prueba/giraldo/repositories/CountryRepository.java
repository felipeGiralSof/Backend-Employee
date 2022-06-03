package com.prueba.giraldo.repositories;

import com.prueba.giraldo.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Integer> { }

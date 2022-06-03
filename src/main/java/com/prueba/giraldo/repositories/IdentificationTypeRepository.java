package com.prueba.giraldo.repositories;

import com.prueba.giraldo.entities.IdentificationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationTypeRepository extends JpaRepository <IdentificationTypeEntity, Integer> { }

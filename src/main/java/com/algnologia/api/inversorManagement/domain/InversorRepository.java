package com.algnologia.api.inversorManagement.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InversorRepository extends JpaRepository<Inversor, Integer> {
    Inversor findBynumeroSerie(String numeroSerie);
}

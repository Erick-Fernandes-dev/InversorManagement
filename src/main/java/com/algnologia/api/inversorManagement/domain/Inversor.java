package com.algnologia.api.inversorManagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inversors")
@Entity(name = "Inversor")
public class Inversor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Marca marca;

    private Float potencia;

    private String modelo;

    private String numeroSerie;

    private boolean temItem;

    private String observacoes;

    private LocalDateTime data;



}

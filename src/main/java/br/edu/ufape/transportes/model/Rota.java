package br.edu.ufape.transportes.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Rota {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private List<String> pontos;
    private double distanciaTotal;

}

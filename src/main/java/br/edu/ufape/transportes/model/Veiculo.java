package br.edu.ufape.transportes.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue
    private Long id;
    private String placa;
    private String modelo;
    private int capacidade;

}

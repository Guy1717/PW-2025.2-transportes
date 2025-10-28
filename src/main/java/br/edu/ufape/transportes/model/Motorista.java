package br.edu.ufape.transportes.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Motorista extends Pessoa /* implements Avaliavel */ {

    private String cnh;
    private double avaliacaoGeral;
    private List<Integer> avaliacoes;

    // void aceitarCorrida(Corrida corrida){};

}

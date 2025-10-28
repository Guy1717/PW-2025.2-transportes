package br.edu.ufape.transportes.model;

import java.util.List;

import lombok.Data;

@Data
public class SistemaCorridas {

    private List<Corrida> corridas;
    private List<Motorista> motoristas;
    private List<Passageiro> passageiros;

    // Motorista buscarMotoristaDisponivel(){};
    // void registrarCorrida(Corrida corrida){};
}
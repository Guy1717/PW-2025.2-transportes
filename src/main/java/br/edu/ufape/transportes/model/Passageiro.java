package br.edu.ufape.transportes.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Passageiro extends Pessoa /*implements Avaliavel*/ {

	private float saldo;
	private List<Integer> avaliacoes;

	// Corrida solicitarCorrida(String origem, String destino){};
	// void pagar(double valor){};
	
}

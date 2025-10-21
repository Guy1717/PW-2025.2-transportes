package br.edu.ufape.transportes.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Passageiro extends Pessoa {

	private float saldo;
	private List<Integer> avaliacoes;
	
}

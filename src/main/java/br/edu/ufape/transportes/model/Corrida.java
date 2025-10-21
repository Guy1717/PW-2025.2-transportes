package br.edu.ufape.transportes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Corrida {

	@Id
	@GeneratedValue
	private Long id;
	private String origem;
	private String destino;
	private double distanciaKm;
	
	@ManyToOne
	private Passageiro passageiro;
}

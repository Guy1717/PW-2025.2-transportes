package br.edu.ufape.transportes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Corrida {

	@Id
	@GeneratedValue
	private Long id;
	private String origem;
	private String destino;
	private double distanciaKm;
	private StatusCorrida status;

	@ManyToOne
	private Passageiro passageiro;

	@ManyToOne
	private Motorista motorista;

	private Pagamento pagamento;
	private Rota rota;

	// Rota

	// double calcularTarifa(){};
	// void iniciar(){};
	// void finalizar(){};
}

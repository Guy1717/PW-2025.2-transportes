package br.edu.ufape.transportes.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento {

    @Id
    @GeneratedValue
    private Long id;

    private double valor;

    // boolean processarPagamento(){};

}

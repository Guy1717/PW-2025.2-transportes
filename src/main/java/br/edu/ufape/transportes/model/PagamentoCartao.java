package br.edu.ufape.transportes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PagamentoCartao extends Pagamento {

    private String numeroCartao;

}

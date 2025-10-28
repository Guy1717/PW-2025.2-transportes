package br.edu.ufape.transportes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PagamentoPix extends Pagamento{

    private String chavePix;

}

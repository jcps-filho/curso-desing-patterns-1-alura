package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}

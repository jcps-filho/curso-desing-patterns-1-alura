package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	abstract BigDecimal calcular(Orcamento orcamento);

}

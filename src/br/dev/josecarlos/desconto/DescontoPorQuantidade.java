package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class DescontoPorQuantidade extends Desconto {
	
	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}

}

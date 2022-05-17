package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class DescontoPorPreco extends Desconto {
	
	public DescontoPorPreco(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(orcamento);
	}

}

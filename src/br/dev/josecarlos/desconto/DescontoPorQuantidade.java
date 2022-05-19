package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class DescontoPorQuantidade extends Desconto {
	
	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidade() > 5;
	}

}

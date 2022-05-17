package br.dev.josecarlos.desconto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class CalculadoraDeDescontosComChain {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoPorQuantidade(new DescontoPorPreco(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}

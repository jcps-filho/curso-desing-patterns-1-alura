package br.dev.josecarlos.imposto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class CalculadoraDeImpostosComStrategy {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}

package br.dev.josecarlos.imposto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class CalculadoraDeImpostosSemStrategy {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
			case ICMS:
				return orcamento.getValor().multiply(new BigDecimal("0.1"));
			case ISS:
				return orcamento.getValor().multiply(new BigDecimal("0.06"));
			default:
				return BigDecimal.ZERO;
		}
	}

}

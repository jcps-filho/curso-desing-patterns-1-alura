package br.dev.josecarlos.imposto;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
}

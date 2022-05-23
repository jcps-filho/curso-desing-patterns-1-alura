package br.dev.josecarlos.orcamento.situacao;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}

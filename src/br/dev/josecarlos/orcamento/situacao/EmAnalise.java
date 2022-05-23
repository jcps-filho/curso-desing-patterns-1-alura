package br.dev.josecarlos.orcamento.situacao;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {
	
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

}

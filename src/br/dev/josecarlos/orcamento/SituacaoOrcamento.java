package br.dev.josecarlos.orcamento;

import java.math.BigDecimal;

import br.dev.josecarlos.DomainException;

public abstract class  SituacaoOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser reprovado!");
	}

	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser finalizado!");
	}

}

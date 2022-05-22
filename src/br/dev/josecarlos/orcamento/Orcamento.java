package br.dev.josecarlos.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidade;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
}

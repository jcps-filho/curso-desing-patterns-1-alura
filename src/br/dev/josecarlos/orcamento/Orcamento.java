package br.dev.josecarlos.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidade;

	public Orcamento(BigDecimal valor, int quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}

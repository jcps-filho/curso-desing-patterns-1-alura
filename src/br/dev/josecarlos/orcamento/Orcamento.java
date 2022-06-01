package br.dev.josecarlos.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.dev.josecarlos.orcamento.situacao.EmAnalise;
import br.dev.josecarlos.orcamento.situacao.Finalizado;
import br.dev.josecarlos.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{
	
	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;

	public Orcamento() {
		super();
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<Orcavel>();
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
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

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}
	
	public void adicionarItem(Orcavel item) {
		this.valor = this.valor.add(item.getValor());
		this.itens.add(item);
	}
}

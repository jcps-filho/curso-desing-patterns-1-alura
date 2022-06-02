package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.orcamento.ItemOrcamento;
import br.dev.josecarlos.orcamento.Orcamento;
import br.dev.josecarlos.orcamento.OrcamentoProxy;

public class TesteProxy {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}

}

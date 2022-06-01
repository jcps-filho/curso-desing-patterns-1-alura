package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.desconto.CalculadoraDeDescontosComChain;
import br.dev.josecarlos.desconto.CalculadoraDeDescontosSemChain;
import br.dev.josecarlos.imposto.CalculadoraDeImpostosComStrategy;
import br.dev.josecarlos.imposto.CalculadoraDeImpostosSemStrategy;
import br.dev.josecarlos.imposto.ISS;
import br.dev.josecarlos.imposto.TipoImposto;
import br.dev.josecarlos.orcamento.ItemOrcamento;
import br.dev.josecarlos.orcamento.Orcamento;

public class App {

	public static void main(String[] args) {
		
		
		Orcamento orcamento1 = new Orcamento();
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		//Implementação SEM Strategy
		CalculadoraDeImpostosSemStrategy calculadoraSemStrategy = new CalculadoraDeImpostosSemStrategy();
		System.out.println(calculadoraSemStrategy.calcular(orcamento1, TipoImposto.ISS));
		
		//Implementação COM Strategy
		CalculadoraDeImpostosComStrategy calculadoraDeImpostosComStrategy = new CalculadoraDeImpostosComStrategy();
		System.out.println(calculadoraDeImpostosComStrategy.calcular(orcamento1, new ISS(null)));
		
		//Implementação SEM Chain Responsability
		CalculadoraDeDescontosSemChain calculadoraDeDescontosSemChain = new CalculadoraDeDescontosSemChain();
		System.out.println(calculadoraDeDescontosSemChain.calcular(orcamento1));
		System.out.println(calculadoraDeDescontosSemChain.calcular(orcamento2));
		
		//Implementação COM Chain Responsability
		CalculadoraDeDescontosComChain calculadoraDeDescontosComChain = new CalculadoraDeDescontosComChain();
		System.out.println(calculadoraDeDescontosComChain.calcular(orcamento1));
		System.out.println(calculadoraDeDescontosComChain.calcular(orcamento2));
	}
}

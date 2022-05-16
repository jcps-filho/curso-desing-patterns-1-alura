package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.imposto.CalculadoraDeImpostosComStrategy;
import br.dev.josecarlos.imposto.CalculadoraDeImpostosSemStrategy;
import br.dev.josecarlos.imposto.ISS;
import br.dev.josecarlos.imposto.TipoImposto;
import br.dev.josecarlos.orcamento.Orcamento;

public class App {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		//Implementação SEM Strategy
		CalculadoraDeImpostosSemStrategy calculadoraSemStrategy = new CalculadoraDeImpostosSemStrategy();
		System.out.println(calculadoraSemStrategy.calcular(orcamento, TipoImposto.ISS));
		
		//Implementação COM Strategy
		CalculadoraDeImpostosComStrategy calculadoraDeImpostosComStrategy = new CalculadoraDeImpostosComStrategy();
		System.out.println(calculadoraDeImpostosComStrategy.calcular(orcamento, new ISS()));

	}
}

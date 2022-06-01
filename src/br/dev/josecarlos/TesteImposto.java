package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.imposto.CalculadoraDeImpostosComStrategy;
import br.dev.josecarlos.imposto.ICMS;
import br.dev.josecarlos.imposto.ISS;
import br.dev.josecarlos.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostosComStrategy calculadora = new CalculadoraDeImpostosComStrategy();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}

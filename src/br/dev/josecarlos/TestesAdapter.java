package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.http.JavaHttpClient;
import br.dev.josecarlos.orcamento.Orcamento;
import br.dev.josecarlos.orcamento.RegistroDeOrcamento;

public class TestesAdapter {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento);
	}

}

package br.dev.josecarlos.orcamento;

import java.util.Map;

import br.dev.josecarlos.DomainException;
import br.dev.josecarlos.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento){
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento ainda não foi finalizado!");
		}
		String url = "http://josecarlos.dev.br";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeDeItens", orcamento.getQuantidadeItens()
				);
		
		http.post(url, dados);
	}

}

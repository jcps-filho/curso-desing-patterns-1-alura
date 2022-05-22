package br.dev.josecarlos.pedido;

import java.time.LocalDateTime;

import br.dev.josecarlos.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	// Construtor com injeção de dependências: Service, Repository...
	
	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Executar inserção no banco de dados");
		System.out.println("Executar envio de email com dados do pedido");
	}

}

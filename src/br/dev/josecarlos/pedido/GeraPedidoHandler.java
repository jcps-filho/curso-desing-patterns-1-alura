package br.dev.josecarlos.pedido;

import java.time.LocalDateTime;

import br.dev.josecarlos.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	// Construtor com inje��o de depend�ncias: Service, Repository...
	
	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Executar inser��o no banco de dados");
		System.out.println("Executar envio de email com dados do pedido");
	}

}

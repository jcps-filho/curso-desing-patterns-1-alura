package br.dev.josecarlos.pedido.acao;

import br.dev.josecarlos.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcoesAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Executar envio de email com dados do pedido");
	}

}

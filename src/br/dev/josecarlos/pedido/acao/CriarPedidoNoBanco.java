package br.dev.josecarlos.pedido.acao;

import br.dev.josecarlos.pedido.Pedido;

public class CriarPedidoNoBanco implements AcoesAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Executar inserção no banco de dados");
	}

}

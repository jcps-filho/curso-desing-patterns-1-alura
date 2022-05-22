package br.dev.josecarlos.pedido.acao;

import br.dev.josecarlos.pedido.Pedido;

public class CriarPedidoNoBanco implements AcoesAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Executar inser��o no banco de dados");
	}

}

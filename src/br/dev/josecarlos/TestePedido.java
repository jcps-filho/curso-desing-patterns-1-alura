package br.dev.josecarlos;

import java.math.BigDecimal;
import java.util.Arrays;

import br.dev.josecarlos.pedido.GeraPedido;
import br.dev.josecarlos.pedido.GeraPedidoHandler;
import br.dev.josecarlos.pedido.acao.CriarPedidoNoBanco;
import br.dev.josecarlos.pedido.acao.EnviarPedidoPorEmail;

public class TestePedido {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(gerador);

	}

}

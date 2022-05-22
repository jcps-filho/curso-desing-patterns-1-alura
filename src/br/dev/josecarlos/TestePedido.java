package br.dev.josecarlos;

import java.math.BigDecimal;

import br.dev.josecarlos.pedido.GeraPedido;
import br.dev.josecarlos.pedido.GeraPedidoHandler;

public class TestePedido {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);

	}

}

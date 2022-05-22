package br.dev.josecarlos.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.dev.josecarlos.orcamento.Orcamento;
import br.dev.josecarlos.pedido.acao.AcoesAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcoesAposGerarPedido> acoesAposGerarPedido;
	
	public GeraPedidoHandler(List<AcoesAposGerarPedido> acoesAposGerarPedido) {
		this.acoesAposGerarPedido = acoesAposGerarPedido;
	}

	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}

}

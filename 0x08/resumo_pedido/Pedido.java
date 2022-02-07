public class Pedido {

	private double percentualDesconto;
	private ItemPedido[] itens;

	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}

	public double calcularTotal() {
		double total = 0;
		double liquido = 0.0;
		for (ItemPedido itemPedido : itens) {
			liquido = itemPedido.getProduto().obterPrecoLiquido();
			total += (liquido * itemPedido.getQuantidade());
		}

		total -= percentualDesconto / 100 * total;
		return total;
	}

	public void apresentarResumoPedido() {
		double produtosTotal = 0.0;

		System.out.println("------- RESUMO PEDIDO -------");

		for (ItemPedido itemPedido : itens) {
			System.out.printf("Tipo: %s ", itemPedido.getProduto().getClass().getSimpleName());
			System.out.printf(" Titulo: %s ", itemPedido.getProduto().getTitulo());
			System.out.printf(" Preco: %.2f ", itemPedido.getProduto().obterPrecoLiquido());
			System.out.printf(" Quant: %s ", itemPedido.getQuantidade());
			double totalItens = itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
			System.out.printf(" Total: %.2f\n", totalItens);
			produtosTotal += totalItens;

		}

		double desconto = percentualDesconto / 100 * produtosTotal;
		System.out.println("----------------------------");
		System.out.printf("DESCONTO: %.2f\n", desconto);
		System.out.printf("TOTAL PRODUTOS: %.2f\n", produtosTotal);
		System.out.println("----------------------------");
		System.out.printf("TOTAL PEDIDO: %.2f\n", produtosTotal - desconto);
		System.out.println("----------------------------");

	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}
}

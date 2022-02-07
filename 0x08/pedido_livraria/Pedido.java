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

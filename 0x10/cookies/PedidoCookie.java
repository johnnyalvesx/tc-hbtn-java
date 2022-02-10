public class PedidoCookie {

    // atributos
    public String sabor;
    public int quantidadeCaixas;

    // método construtor
    public PedidoCookie(String sabor, int quantidadeCaixas) {
	this.sabor = sabor;
	this.quantidadeCaixas = quantidadeCaixas;
    }

    // métodos acessores
    public String getSabor() {
	return sabor;
    }

    public int getQuantidadeCaixas() {
	return quantidadeCaixas;
    }
}

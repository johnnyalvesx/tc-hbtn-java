import java.util.ArrayList;

public class Pedido {

    private static ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public ArrayList<PedidoCookie> getCookies() {
	return cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
	cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
	int total = 0;
	for (PedidoCookie cookie : cookies) {
	    total = total + cookie.quantidadeCaixas;
	}
	return total;
    }

    public int removerSabor(String sabor) {
	int size = obterTotalCaixas();
	cookies.removeIf(s -> s.getSabor().equalsIgnoreCase(sabor));
	return size - obterTotalCaixas();
    }
}

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){

        return pedido.getProdutos().stream().filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produto){
       return produto.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int i) {

        return produtos.stream().filter(produto -> produto.getPreco() >= i).collect(Collectors.toList());
    }
}

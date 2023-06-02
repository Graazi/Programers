package estoque;

import java.util.ArrayList;
import java.util.List;

class ADM {
    private List <Produto> produtos;

    public ADM() {
        produtos = new ArrayList<>();
    }

    public static void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public static void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public static Produto buscarProdutoPorTitulo(String titulo) {
        for (Produto produto : produtos) {
            if (produto.getTitulo().equalsIgnoreCase(titulo)) {
                return produto;
            }
        }
        return null;
    }

    public static Produto[] getProdutos() {
        return null;
    }
}

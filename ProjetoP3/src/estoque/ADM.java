package estoque;

import java.util.ArrayList;
import java.util.List;

class ADM {
    private List <Produto> produtos;

    public ADM() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public Produto buscarProdutoPorTitulo(String titulo) {
        for (Produto produto : produtos) {
            if (produto.getTitulo().equalsIgnoreCase(titulo)) {
                return produto;
            }
        }
        return null;
    }
}

package usuario;

import java.util.ArrayList;

class AreaAdministrativa {
    private Lista<Produto> produtos;

    public AreaAdministrativa() {
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

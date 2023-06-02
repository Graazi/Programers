package pedido;

import java.util.ArrayList;

class Carrinho {
    private Lista<Produto> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
        System.out.println("Produto adicionado ao carrinho com sucesso!");
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
        System.out.println("Produto removido do carrinho com sucesso!");
    }

    public void exibirCarrinho() {
        System.out.println("Itens no carrinho:");
        for (Produto item : itens) {
            item.exibirDetalhes();
        }
    }
}

package estoque;

// Classe abstrata para representar um produto
abstract class Produto {
    private String titulo;
    private double preco;

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    // Método abstrato para exibir detalhes do produto
    public abstract void exibirDetalhes();
}
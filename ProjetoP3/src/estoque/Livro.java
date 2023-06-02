package estoque;

class Livro extends Produto {
    private String autor;

    public Livro(String titulo, double preco, String autor) {
        super(titulo, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + getPreco());
        System.out.println("---------------------------");
    }
}


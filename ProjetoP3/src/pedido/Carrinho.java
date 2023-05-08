package pedido;

public class Carrinho {

    private String livro;
    private int numero;
    private double preco;

    public Carrinho (String livro, int numero, double preco) {
        this.livro = livro;
        this.numero = numero;
        this.preco = preco;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

}

package estoque;
public class Livro extends Itens {

    private int tamanho;

    public Livro (String nome, double preco, int tamanho){
        super (nome, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}

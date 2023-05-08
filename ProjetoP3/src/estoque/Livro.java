package estoque;
public class Livro {
    private String nome;
    private double preco;
    private int quantEst;
    private int codProd;
    
    public Livro(String nome, double preco, int quantEst, int codProd) {
        this.nome = nome;
        this.preco = preco;
        this.quantEst = quantEst;
        this.codProd = codProd;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantEst() {
        return quantEst;
    }
    public void setQuantEst(int quantEst) {
        this.quantEst = quantEst;
    }
    public int getCodProd() {
        return codProd;
    }
    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }
    
}

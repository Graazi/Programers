package estoque;

public abstract class Estoque {
    private String nome;
    private int quantidade;
    private int codProduto;

    public void estoque (String nome, int quantidade, int codProduto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    
}

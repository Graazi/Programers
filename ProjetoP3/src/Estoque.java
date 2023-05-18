public class Estoque {
    //lista de estoque  e procurar o pedido;
    private String nome;
    private int codigo;

   
    public Estoque(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public void listaDePedidos() {
           
    }
    
    public void procurarPedido(int numeroPedido) {
        
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}

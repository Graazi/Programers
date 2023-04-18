package pedido;

public class Pagamento {

    private String boleto;
    private String pix;
    private String cartao;

    
    public Pagamento(String boleto, String pix,String cartao) {
        this.boleto = boleto;
        this.pix = pix;
        this.cartao = cartao;
        
    }

    public String getBoleto() {
        return boleto;
    }
    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }
    public String getPix() {
        return pix;
    }
    public void setPix(String pix) {
        this.pix = pix;
    }
    public String getCartão() {
        return cartao;
    }
    public void setCartão(String cartão) {
        this.cartao = cartão;
    }
    
}

package pagamento;

public class Debito implements ValidarPagamento{

    private String bandeira;
    private double valor;
    private boolean cartaoAceito;
    
    @Override
    public boolean statusDoPagamento() {
        if(cartaoAceito){

            return true;
            
        }else{
            return false;
        }
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCartaoAceito() {
        return cartaoAceito;
    }

    public void setCartaoAceito(boolean cartaoAceito) {
        this.cartaoAceito = cartaoAceito;
    }

    
    
}

package pagamento;

public class Pix implements ValidarPagamento {

    private String bandeira;
    private double valor;
    private boolean pixRealizado;

   
    public Pix(String bandeira, double valor, boolean pixRealizado) {
        this.bandeira = bandeira;
        this.valor = valor;
        this.pixRealizado = pixRealizado;
    }


    @Override
    public boolean statusDoPagamento() {
      
        if(pixRealizado){

            return true;
            
        } else {
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


    public boolean isPixRealizado() {
        return pixRealizado;
    }


    public void setPixRealizado(boolean pixRealizado) {
        this.pixRealizado = pixRealizado;
    }

    
    
}

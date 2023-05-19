package pagamento;

public class Pix implements ValidarPagamento{

    
    private boolean pixRealizado;
    private String bandeira;
    private double valor;

   
    public Pix(String bandeira, double valor, boolean pixRealizado) {
        this.bandeira = bandeira;
        this.valor = valor;
        this.pixRealizado = pixRealizado;
    }


    @Override
    public boolean statusDoPagamento() {
      
        if(pixRealizado){

            return true;
            
        }else{
            return false;
        }

    }
    
}

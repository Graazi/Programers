package pagamento;

public class Boleto implements ValidarPagamento {
    private double valor;
    private boolean boletoPago;

    public Boleto(double valor, boolean boletoPago) {
        this.valor = valor;
        this.boletoPago = boletoPago;
    }


    @Override
    public boolean statusDoPagamento() {
      
        if(boletoPago){

            return true;
            
        } else {
            return false;
        }

    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public boolean isBoletoPago() {
        return boletoPago;
    }


    public void setBoletoPago(boolean boletoPago) {
        this.boletoPago = boletoPago;
    }

}

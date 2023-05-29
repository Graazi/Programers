import java.util.ArrayList;

public class ListaCliente {
    private ArrayList<Paciente> clientes;

    public ListaCliente(ArrayList<Paciente> clientes) {
        this.clientes  = clientes;
    }

    public ListaCliente() {
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}

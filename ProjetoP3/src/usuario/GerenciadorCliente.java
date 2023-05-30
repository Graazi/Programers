package usuario;
import dados.ListaCliente;
import java.util.ArrayList;

public class GerenciadorCliente {
    private ListaCliente clientes;

    public GerenciadorCliente() {
        clientes = new ListaCliente();
    }

    public GerenciadorCliente(ListaCliente clientes) {
        this.pacientes = clientes;
    }

    public ListaCliente getClientes() {
        return clientes;
    }

    public void setClientes(ListaCliente clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Paciente p){
        if(buscar(c) == null){
            clientes.getClientes().add(c);
            System.out.println("Cliente adicionado ao sistema!");
        }
        else
            System.out.println("Cliente já cadastrado no sistema!");
    }

    public Cliente buscar(Cliente c){
        if(!clientes.getClientes().isEmpty()){
            int aux = 0;
            while(aux < clientes.getClientes().size()){
                if(c.compareTo(clientes.getClientes().get(aux)) == 0) {
                    c = new Cliente(clientes.getClientes().get(aux).getNome(), clientes.getClientes().get(aux).getCpf(), clientes.getClientes().get(aux).getSenha());
                    return c;
                }
                aux++;
            }
        }
        return null;
    }

    public void deleteCliente(Cliente c, int x){
        if(buscar(c) != null){
            clientes.getClientes().remove(x);
            System.out.println("Cliente removido do sistema!");
        }
        else
            System.out.println("Cliente não encontrado no sistema!");
    }
    public void exibirLista(){
        if(clientes.getClientes().isEmpty())
            System.out.println("Lista de cientes vazia!");
        else {
            for(int i = 0; i < clientes.getClientes().size(); i++){
                System.out.println(i + " - Nome: '" + pacientes.getPacientes().get(i).getNome() + "'. CPF: '" +
                        clientes.getClientes().get(i).getCpf() + "'. Senha: '" + clientes.getClientes().get(i).getSenha() + "'");
            }
        }
    }
    public int buscarInt(Cliente c){
        if(!clientes.getClientes().isEmpty()){
            int aux = 0;
            while(aux < clientes.getClientes().size()){
                if(c.compareTo(clientes.getClientes().get(aux)) == 0)
                    return aux;
                aux++;
            }
        }
        return -1;
    }
}
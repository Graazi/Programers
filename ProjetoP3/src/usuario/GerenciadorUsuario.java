package usuario;

import java.util.Objects;

public class GerenciadorUsuario {
    private ListaUsuario usuarios;

    public GerenciadorUsuario(ListaUsuario usuarios) {
        this.usuarios = usuarios;
    }

    public GerenciadorUsuario() {
        usuarios = new ListaUsuario();
    }

    public ListaDeFuncionario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ListaUsuario usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario u){
        //if (buscar(u) == null) {
            usuarios.add(f);
            System.out.println("Funcionario adicionado ao sistema");
        //} else
            //System.out.println("Usuario ja cadastrado no sistema");

    }
    public Usuario buscar(Usuario u){
        if(!usuario.getUsuarios().isEmpty()){
            int aux = 0;
            while(aux < usuarios.getUsuarios().size()){
                if(f.compareTo(usuarios.getUsuarios().get(aux)) == 0)
                    return f;
                aux++;
            }
        }
        return null;
    }

    public void deleteUsuario(Usuario f, int x){

        if(!Objects.equals(f.getMatricula(), "M000")) {
            if (buscar(f) != null) {
                usuarios.getUsuarios().remove(x);
                System.out.println("Usuario removido do sistema");
            } else
                System.out.println("Usuario não encontrado no sistema");
        }
        else
            System.out.println("Usuario principal, não pode ser deletado");
    }

    public void exibirLista(){
        if(usuarios.getUsurios().isEmpty())
            System.out.println("Lista de usuarios esta vazia");
        else {
            for(int i = 0; i < usuarios.getFuncionarios().size(); i++){
                System.out.println(i + " - Nome: '" + usuarios.getUsuarios().get(i).getNome() + "'. CPF: '" +
                        usuarios.getUsuarios().get(i).getCpf() + "'. Telefone: '" + usuarios.getUsuarios().get(i).getTelefone()
                        + "'. Matricula: '" + usuarios.getUsuarios().get(i).getMatricula() + "'. Salario: " + usuarios.getUsuarios().get(i).getSalario() + "'");
            }
        }
    }

    public int buscarInt(Usuario u){
        if(!usuarios.getUsuarios().isEmpty()){
            int aux = 0;
            while(aux < usuarios.getUsuarios().size()){
                if(u.compareTo(usuarios.getUsuarios().get(aux)) == 0)
                    return aux;
                aux++;
            }
        }
        return -1;
    }

    public void exibirUsuario(String matri){
        if(!usuarios.getUsuarios().isEmpty()){
            int x = usuarios.getUsuarios().size();
            int aux = 0;
            while(aux < x){
                if(matri.compareTo(usuarios.getUsuarios().get(aux).getMatricula()) == 0){
                    System.out.println("Nome: '" + usuarios.getUsuarios().get(aux).getNome() + "'. CPF: '" +
                            usuarios.getFuncionarios().get(aux).getCpf() + "'. Telefone: '" + usuarios.getUsuarios().get(aux).getTelefone()
                            + "'. Matricula: '" + usuarios.getUsuarios().get(aux).getMatricula() + "'. Salario: " +
                            usuarios.getUsuarios().get(aux).getSalario() + "'");
                    return;
                }
                aux++;
            }
            System.out.println("Usuario não encontrado!");
        }
    }
}
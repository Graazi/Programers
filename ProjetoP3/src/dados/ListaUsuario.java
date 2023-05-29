public class ListaUsuario {
    ArrayList<Usuario> usuarios;

    public ListaUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ListaUsuario() {
        usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getCliente() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void add(Usuario u){
        usuarios.add(u);
    }

}
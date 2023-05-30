package usuario;

public class Cliente extends Pessoa implements Comparable <Cliente> {
    
    protected String senha;

    public Cliente(String cpf) {
        super(cpf);
    }

    public Cliente(String nome, String cpf, String senha) {
        super(nome, cpf);
        this.senha = senha;

    }

    public Cliente() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {

        return new String("Nome: " + nome +
                "\nCPF: " + cpf +
                "\nSenha: '" + senha);
    }


    @Override
    public int compareTo(Cliente c) {
        int result;
        result = this.getCpf().compareTo(c.getCpf());
        return result;
    }
}

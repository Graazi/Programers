package usuario;

public abstract class ADM extends Pessoa implements Comparable <ADM> {

    protected String matricula;

    public ADM(String matricula) {
        this.matricula = matricula;
    }

    public ADM(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    @Override
    public int compareTo(ADM a) {
        int result;
        result = this.getMatricula().compareTo(a.getMatricula());
        return result;
    }
}
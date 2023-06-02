package usuario;

import dados.ListaADM;

import java.util.Objects;

public class GerenciadorADM {
    private ListaADM adms;

    public GerenciadorADM() {
        adms = new ListaADM();
    }

    public GerenciadorADM(ListaADM adms) {
        this.adms = adms;
    }

    public ListaADM getAdms() {
        return adms;
    }

    public void setAdms(ListaADM adms) {
        this.adms = adms;
    }

    public void addADM(ADM a){
        if (buscar(a) == null) {
            adms.getAdm().add(a);
        }
    }

    public ADM buscar(ADM a){
        if(!adms.getAdm().isEmpty()){
            int aux = 0;
            while(aux < adms.getAdm().size()){
                if(a.compareTo(adms.getAdm().get(aux)) == 0)
                    return a;
                aux++;
            }
        }
        return null;
    }

    public int buscarInt(ADM a){
        if(!adms.getAdm().isEmpty()){
            int aux = 0;
            while(aux < adms.getAdm().size()){
                if(a.compareTo(adms.getAdm().get(aux)) == 0)
                    return aux;
                aux++;
            }
        }
        return -1;
    }

    public void deleteUsuario(ADM a, int i){
        if(!Objects.equals(a.getMatricula(), "M000")) {
            if (buscar(a) != null)
                adms.getAdm().remove(i);
        }
    }

    public void exibirLista(){
        if(adms.getAdm().isEmpty())
            System.out.println("Lista de administração vazia");
        else {
            for(int i = 0; i < adms.getAdm().size(); i++){
                System.out.println(i + " - Nome: '" + adms.getAdm().get(i).getNome() + "'. CPF: '" +
                        adms.getAdm().get(i).getCpf() + "'. Matricula: '" + adms.getAdm().get(i).getMatricula() + "'");
            }
        }
    }

}
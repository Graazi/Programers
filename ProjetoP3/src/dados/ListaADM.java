import java.util.ArrayList;

public class ListaADM {
    private ArrayList<Usuario> adm;

    public ListaADM() {
        adm = new ArrayList<>();
    }

    public ListaADM(ArrayList<Usuario> adm) {
        this.adm = adm;
    }

    public ArrayList<Usuario> getAdm() {
        return adm;
    }

    public void setAdm (ArrayList<Usuario> adm) {
        this.adm = adm;
    }

}
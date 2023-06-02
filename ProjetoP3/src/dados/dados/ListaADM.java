package dados;

import usuario.ADM;
import java.util.ArrayList;

public class ListaADM {
    private ArrayList<ADM> adm;

    public ListaADM() {
        adm = new ArrayList<>();
    }

    public ListaADM(ArrayList<ADM> adm) {
        this.adm = adm;
    }

    public ArrayList<ADM> getAdm() {
        return adm;
    }

    public void setAdm (ArrayList<ADM> adm) {
        this.adm = adm;
    }

}

package td7;

import td5.Multicoque;
import td5.SuivreAlize;
import td5.Voilier;

import java.util.ArrayList;

public abstract class InscriptionVoilier {
    ArrayList inscriptions = new ArrayList();

    public abstract Voilier factoryMethod(String nomVoilier, Categorie categorie);

    public void enregistrement(Voilier vo) {
        inscriptions.add(vo);
    }
}

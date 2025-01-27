package td7;

import td5.Monocoque;
import td5.Voilier;

public class InscriptionMono extends InscriptionVoilier{
    @Override
    public Voilier factoryMethod(String nomVoilier, Categorie categorie) {
        Voilier voilier = new Monocoque(nomVoilier);
        switch(categorie){
            case IMOCA -> {
                return new Imoca(nomVoilier);
            }
            case CLASS40 -> {
                return new Class40(nomVoilier);
            }
            case RHUMMONO -> {
                return new RhumMono(nomVoilier);
            }
        }
        return voilier;
    }
}

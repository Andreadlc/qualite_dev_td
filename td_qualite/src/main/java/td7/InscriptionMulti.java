package td7;

import td5.Multicoque;
import td5.Voilier;

public class InscriptionMulti extends InscriptionVoilier{
    @Override
    public Voilier factoryMethod(String nomVoilier, Categorie categorie) {
        Voilier voilier = new Multicoque(nomVoilier);
        switch (categorie) {
            case MULTI50 -> {
                return new Multi50(nomVoilier);
            }
            case ULTIM ->  {
                return new Ultim(nomVoilier);
            }
            case RHUMMULTI -> {
                return new RhumMulti(nomVoilier);
            }
        }
        return voilier;
    }
}

package td7;

import td5.Multicoque;
import td5.SuivreRoute;

public final class RhumMulti extends Multicoque {
    public RhumMulti (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public RhumMulti (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"RhumMulti";
    }
}

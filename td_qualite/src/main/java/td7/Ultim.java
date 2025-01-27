package td7;

import td5.Multicoque;
import td5.SuivreRoute;

public final class Ultim extends Multicoque {
    public Ultim (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public Ultim (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"Ultim";
    }
}

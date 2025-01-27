package td7;

import td5.Monocoque;
import td5.SuivreRoute;

public final class Imoca extends Monocoque {
    public Imoca (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public Imoca (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"Imoca";
    }
}

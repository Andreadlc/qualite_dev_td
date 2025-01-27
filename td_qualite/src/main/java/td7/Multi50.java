package td7;

import td5.Multicoque;
import td5.SuivreRoute;

public final class Multi50 extends Multicoque {
    public Multi50 (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public Multi50 (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"Multi50";
    }
}

package td7;

import td5.Monocoque;
import td5.SuivreRoute;

public final class Class40 extends Monocoque {
    public Class40 (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public Class40 (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " " +"Class40";
    }
}

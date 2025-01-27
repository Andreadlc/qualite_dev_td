package td7;

import td5.Monocoque;
import td5.SuivreRoute;

public final class RhumMono extends Monocoque {
    public RhumMono (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public RhumMono (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"RhumMono";
    }
}

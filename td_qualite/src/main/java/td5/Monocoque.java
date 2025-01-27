package td5;

public class Monocoque extends Voilier {

    public Monocoque (String nom, SuivreRoute suivreRoute){
        super(nom,suivreRoute);
    }

    public Monocoque (String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"Monoque";
    }
}

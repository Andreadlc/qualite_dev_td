package td5;

public class Multicoque extends Voilier{

    public Multicoque(String nom, SuivreRoute suivreRoute){

        super(nom,suivreRoute);
    }

    public Multicoque(String nom){
        super(nom);
    }

    @Override
    public String toString() {
        return super.toString() + " "+"Multicoque";
    }
}

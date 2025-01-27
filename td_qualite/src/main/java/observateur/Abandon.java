package observateur;

import java.util.List;

public class Abandon {
    private final String nom;
    private final String classe;
    private final String skipper;

    public Abandon(String nom, String classe, String skipper) {
        this.nom = nom;
        this.classe = classe;
        this.skipper = skipper;
    }

    public String getNom() {
        return nom;
    }

    public String getClasse() {
        return classe;
    }

    public String getSkipper() {
        return skipper;
    }

    public String toString() {
        return "Abandon{" +
                "nom='" + nom + '\'' +
                ", classe='" + classe + '\'' +
                ", skipper='" + skipper + '\'' +
                '}';
    }
}

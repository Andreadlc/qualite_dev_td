package observateur;

import java.util.List;

/**
 * Represente un abandon avec un nom, une classe et un skipper.
 */
public class Abandon {
    /**
     * nom du voilier
     */
    private final String nom;
    /**
     * nom du type de class
     */
    private final String classe;
    /**
     * nom du skipper
     */
    private final String skipper;

    /**
     * Constructeur pour creer un abandon.
     *
     * @param nom le nom de l abandon
     * @param classe la classe de l abandon
     * @param skipper le skipper associe a l abandon
     */
    public Abandon(String nom, String classe, String skipper) {
        this.nom = nom;
        this.classe = classe;
        this.skipper = skipper;
    }

    /**
     * Obtient le nom de l abandon.
     *
     * @return le nom de l abandon
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient la classe de l abandon.
     *
     * @return la classe de l abandon
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Obtient le skipper de l abandon.
     *
     * @return le skipper de l abandon
     */
    public String getSkipper() {
        return skipper;
    }

    /**
     * Retourne une representation textuelle de l abandon.
     *
     * @return une chaine de caracteres representant l abandon
     */
    @Override
    public String toString() {
        return "Abandon{" +
                "nom='" + nom + '\'' +
                ", classe='" + classe + '\'' +
                ", skipper='" + skipper + '\'' +
                '}';
    }
}

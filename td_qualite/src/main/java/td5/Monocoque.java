package td5;

/**
 * Représente un voilier de type Monocoque.
 * Hérite de la classe {@link Voilier}.
 */
public class Monocoque extends Voilier {

    /**
     * Constructeur pour créer un Monocoque avec un nom et une stratégie de suivi de route.
     *
     * @param nom         le nom du monocoque
     * @param suivreRoute la stratégie de suivi de route associée au monocoque
     */
    public Monocoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    /**
     * Constructeur pour créer un Monocoque avec un nom uniquement.
     *
     * @param nom le nom du monocoque
     */
    public Monocoque(String nom) {
        super(nom);
    }

    /**
     * Retourne une représentation textuelle du monocoque.
     *
     * @return une chaîne de caractères représentant le monocoque
     */
    @Override
    public String toString() {
        return super.toString() + " " + "Monocoque";
    }
}

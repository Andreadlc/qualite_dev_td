package td5;

/**
 * Représente un voilier de type Multicoque.
 * Hérite de la classe {@link Voilier}.
 */
public class Multicoque extends Voilier {

    /**
     * Constructeur pour créer un Multicoque avec un nom et une stratégie de suivi de route.
     *
     * @param nom         le nom du multicoque
     * @param suivreRoute la stratégie de suivi de route associée au multicoque
     */
    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    /**
     * Constructeur pour créer un Multicoque avec un nom uniquement.
     *
     * @param nom le nom du multicoque
     */
    public Multicoque(String nom) {
        super(nom);
    }

    /**
     * Retourne une représentation textuelle du multicoque.
     *
     * @return une chaîne de caractères représentant le multicoque
     */
    @Override
    public String toString() {
        return super.toString() + " " + "Multicoque";
    }
}

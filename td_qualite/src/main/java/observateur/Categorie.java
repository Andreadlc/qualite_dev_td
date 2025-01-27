package observateur;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une catégorie qui observe les abandons liés à une classe spécifique.
 */
public class Categorie implements Observateur {

    /**
     * Nom de la catégorie.
     */
    private final td7.Categorie nom_categorie;

    /**
     * Liste des abandons associés à cette catégorie.
     */
    private final List<Abandon> abandons;

    /**
     * Constructeur pour créer une catégorie.
     *
     * @param nom_categorie le nom de la catégorie associée
     */
    public Categorie(td7.Categorie nom_categorie) {
        this.nom_categorie = nom_categorie;
        this.abandons = new ArrayList<>();
    }

    /**
     * Méthode appelée lorsqu'un observable est mis à jour.
     * Ajoute un abandon à la liste des abandons si sa classe correspond à celle de la catégorie.
     *
     * @param observable l'objet observable à partir duquel la mise à jour est déclenchée
     */
    @Override
    public void actualise(Observable observable) {
        DirectionCourse direction = (DirectionCourse) observable;
        Abandon abandon = direction.getLastAbandon();
        System.out.println("actualise " + abandon.getClasse() + " " + nom_categorie);

        if (abandon.getClasse().equals(this.nom_categorie.toString())) {
            abandons.add(abandon);
        }
    }

    /**
     * Retourne une représentation textuelle de la catégorie, incluant son nom,
     * le nombre d'abandons et la liste des abandons.
     *
     * @return une chaîne de caractères représentant la catégorie
     */
    @Override
    public String toString() {
        return nom_categorie + " " + abandons.size() + " " + abandons;
    }
}

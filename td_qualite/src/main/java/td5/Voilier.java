package td5;

/**
 * Classe abstraite représentant un voilier.
 * Un voilier a un nom et une stratégie de suivi de route.
 */
public abstract class Voilier {
    private String nom;
    private SuivreRoute route;

    /**
     * Constructeur pour créer un voilier avec un nom et une stratégie de suivi de route.
     *
     * @param nom   le nom du voilier
     * @param route la stratégie de suivi de route associée au voilier
     */
    public Voilier(String nom, SuivreRoute route) {
        this.nom = nom;
        this.route = route;
    }

    /**
     * Constructeur pour créer un voilier avec uniquement un nom.
     *
     * @param nom le nom du voilier
     */
    public Voilier(String nom) {
        this.nom = nom;
    }

    /**
     * Constructeur par défaut pour créer un voilier sans nom ni stratégie de suivi de route.
     */
    public Voilier() {
    }

    /**
     * Permet de modifier la stratégie de suivi de route d'un voilier.
     *
     * @param suivreRoute la nouvelle stratégie de suivi de route
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.route = suivreRoute;
    }

    /**
     * Applique la stratégie de suivi de route actuelle au voilier.
     * Appelle la méthode {@link SuivreRoute#suivreRoute()} de la stratégie définie.
     */
    public void appliqueSuivreRoute() {
        if (route != null) {
            route.suivreRoute();
        } else {
            System.out.println("Aucune stratégie de route définie.");
        }
    }

    /**
     * Retourne une représentation textuelle du voilier.
     *
     * @return une chaîne de caractères représentant le voilier
     */
    @Override
    public String toString() {
        return "Voilier : " + nom;
    }
}

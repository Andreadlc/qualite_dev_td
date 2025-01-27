package td5;

/**
 * Classe représentant un voilier.
 * Un voilier possède un nom et une stratégie de suivi de route.
 */
public abstract class Voilier {

    /** Le nom du voilier */
    private String nom;

    /** La stratégie de suivi de route utilisée par le voilier */
    private SuivreRoute route;

    /**
     * Constructeur avec nom et stratégie de suivi de route.
     *
     * @param nom Le nom du voilier.
     * @param route La stratégie de suivi de route du voilier.
     */
    public Voilier(String nom, SuivreRoute route) {
        this.nom = nom;
        this.route = route;
    }

    /**
     * Constructeur avec nom seulement.
     *
     * @param nom Le nom du voilier.
     */
    public Voilier(String nom){
        this.nom = nom;
    }

    /** Constructeur par défaut */
    public Voilier(){
    }

    /**
     * Définit la stratégie de suivi de route.
     *
     * @param suivreRoute La nouvelle stratégie de suivi de route.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute){
        this.route = suivreRoute;
    }

    /**
     * Applique la stratégie de suivi de route du voilier.
     */
    public void appliqueSuivreRoute(){
        route.suivreRoute();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du voilier.
     *
     * @return Une chaîne contenant le nom du voilier.
     */
    @Override
    public String toString() {
        return "Voilier : " + nom;
    }
}

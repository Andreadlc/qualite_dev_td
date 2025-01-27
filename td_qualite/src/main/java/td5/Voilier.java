package td5;

public abstract class Voilier {
    private String nom;
    private SuivreRoute route;

    public Voilier(String nom, SuivreRoute route) {
        this.nom = nom;
        this.route = route;
    }

    public Voilier(String nom){
        this.nom =nom;
    }

    public Voilier(){
    }

    public void setSuivreRoute(SuivreRoute suivreRoute){
        this.route = suivreRoute;
    }

    public void appliqueSuivreRoute(){
        route.suivreRoute();
    }

    @Override
    public String toString() {
        return "Voilier : " + nom ;
    }
}

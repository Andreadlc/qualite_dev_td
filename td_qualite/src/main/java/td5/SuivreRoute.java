package td5;

/**
 * Interface représentant une stratégie de suivi de route.
 * Les classes qui implémentent cette interface définissent des comportements spécifiques de suivi de route.
 */
public interface SuivreRoute {

    /**
     * Méthode pour suivre une route en fonction de la stratégie définie.
     * Chaque implémentation de cette méthode doit spécifier le comportement du suivi de la route.
     */
    public void suivreRoute();
}

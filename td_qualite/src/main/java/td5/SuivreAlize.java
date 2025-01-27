package td5;

/**
 * Implémentation de l'interface {@link SuivreRoute} représentant une stratégie de suivi de route "Alizé".
 * Cette classe définit le comportement spécifique du suivi de route pour le vent Alizé.
 */
public class SuivreAlize implements SuivreRoute {

    /**
     * Méthode qui imprime le suivi de la route utilisant la stratégie Alizé.
     * Affiche "Alize" pour indiquer que la route suit le vent Alizé.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Alize");
    }
}

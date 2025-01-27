package td5;

/**
 * Implémentation de l'interface {@link SuivreRoute} représentant une stratégie de suivi de route par orthodromie.
 * Cette classe définit le comportement spécifique du suivi de route pour l'orthodromie, qui est la route la plus courte entre deux points sur une sphère.
 */
public class SuivreOrthodromie implements SuivreRoute {

    /**
     * Méthode qui imprime le suivi de la route utilisant la stratégie Orthodromie.
     * Affiche "Orthodomie" pour indiquer que la route suit la trajectoire orthodromique.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Orthodromie");
    }
}

package td5;

import td6.ArmementSupplementaire;
import td6.Barre;
import td6.Velo;
import td7.Categorie;
import td7.InscriptionMono;
import td7.InscriptionMulti;

/**
 * Classe principale pour gérer la création de voiliers,
 * l'application des stratégies de suivi de route,
 * et l'inscription des voiliers dans différentes catégories.
 */
public class Main {

    /**
     * Point d'entrée de l'application.
     * Il crée des voiliers, applique des stratégies de suivi de route et réalise des inscriptions.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        // Création d'une stratégie de suivi de route Alizé
        SuivreRoute route1 = new SuivreAlize();

        // Création d'un voilier Monocoque
        Voilier voilier1 = new Monocoque("voilier1");
        voilier1.setSuivreRoute(route1);
        voilier1.appliqueSuivreRoute();

        // Ajout d'armement supplémentaire au voilier (Velo et Barre)
        voilier1 = new Velo(voilier1);
        voilier1 = new Barre(voilier1);

        // Applique la stratégie de route après ajout des fonctionnalités
        voilier1.appliqueSuivreRoute();

        // Affichage des informations sur le voilier
        System.out.println(voilier1);

        // Inscriptions pour voiliers Mono et Multi
        InscriptionMono inscriptionMono = new InscriptionMono();
        InscriptionMulti inscriptionMulti = new InscriptionMulti();

        // Création d'un voilier pour la catégorie CLASS40 via l'inscription
        Voilier voilier2 = inscriptionMulti.factoryMethod("groupama", Categorie.CLASS40);
        voilier2.setSuivreRoute(route1);
        voilier2.appliqueSuivreRoute();

        // Affichage du voilier inscrit
        System.out.println(voilier2);
    }
}

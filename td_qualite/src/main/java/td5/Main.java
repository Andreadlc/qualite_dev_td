package td5;

import td6.ArmementSupplementaire;
import td6.Barre;
import td6.Velo;
import td7.Categorie;
import td7.InscriptionMono;
import td7.InscriptionMulti;

public class Main {
    public static void main(String[] args) {
        SuivreRoute route1 = new SuivreAlize();

        Voilier voilier1 = new Monocoque("voilier1");

        voilier1.setSuivreRoute(route1);
        voilier1.appliqueSuivreRoute();

        voilier1 = new Velo(voilier1);
        voilier1 = new Barre(voilier1);

        voilier1.appliqueSuivreRoute();

        System.out.println(voilier1);

        InscriptionMono inscriptionMono = new InscriptionMono();
        InscriptionMulti inscriptionMulti = new InscriptionMulti();

        Voilier voilier2 = inscriptionMulti.factoryMethod("groupama", Categorie.CLASS40);
        voilier2.setSuivreRoute(route1);
        voilier2.appliqueSuivreRoute();
        System.out.println(voilier2);


    }
}
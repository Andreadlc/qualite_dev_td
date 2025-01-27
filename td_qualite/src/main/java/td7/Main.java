package td7;

import observateur.Abandon;
import observateur.Categorie;
import observateur.DirectionCourse;
import td5.Monocoque;
import td5.SuivreOrthodromie;
import td5.Voilier;
import td6.Velo;

import java.util.HashSet;

public class Main {
        public static void main(String[] args) {
            HashSet<Abandon> lesAbandons = new HashSet<>();
            lesAbandons.add(new Abandon("NExan - art et fenetre", "IMOCA", "Fabrice amedeo"));
            lesAbandons.add(new Abandon("Noxus", "IMOCA", "Fab et youn"));
            lesAbandons.add(new Abandon("Nissan", "CLASS40", "thomas et clement"));


            DirectionCourse sujet = new DirectionCourse();
            Categorie categorie_class40 = new Categorie(td7.Categorie.CLASS40);
            sujet.enregistreObservateur(categorie_class40);
            sujet.simulationCourse(lesAbandons);

            System.out.println(categorie_class40);








        }


}

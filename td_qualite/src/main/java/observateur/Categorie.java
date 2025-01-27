package observateur;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Observateur{

    td7.Categorie nom_categorie;
    List<Abandon> abandons;


    public Categorie(td7.Categorie nom_categorie){
        this.nom_categorie = nom_categorie;
        abandons = new ArrayList<>();
    }

    @Override
    public void actualise(Observable observable) {
        DirectionCourse direction = (DirectionCourse) observable;
        Abandon abandon = direction.getLastAbandon();
        System.out.println("actualise "+ abandon.getClasse()+ " " + nom_categorie);
        if(abandon.getClasse().equals(this.nom_categorie.toString())){
            abandons.add(abandon);
        }

    }

    public String toString(){
        return nom_categorie + " " + abandons.size() + " " + abandons;
    }
}

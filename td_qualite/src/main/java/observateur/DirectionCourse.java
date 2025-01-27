package observateur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public  class DirectionCourse implements Observable {


    private final List<Observateur> observateurs = new ArrayList<>();
    private final List<Abandon> abandons = new ArrayList<>();





    private void nouvelAbandon(Abandon abandon){
        abandons.add(abandon);
        informeObservateurs();
    }


    public void simulationCourse(HashSet<Abandon> abandons){
        for(Iterator<Abandon> i = abandons.iterator(); i.hasNext();){
            this.abandons.add(i.next());
            informeObservateurs();
            try {
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void enregistreObservateur(Observateur o) {
        observateurs.add(o);
    }

    public void desenregistreObservateur(Observateur o) {
        observateurs.remove(o);
    }

    public void informeObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(this);
        }
    }
    //l'observateur va utilise la methode dernier abandon
    public Abandon getLastAbandon(){

        return abandons.getLast();

    }

}

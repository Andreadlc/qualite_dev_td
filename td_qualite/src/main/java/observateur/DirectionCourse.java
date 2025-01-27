package observateur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Classe représentant la direction de la course.
 * Cette classe gère les abandons et informe les observateurs des changements.
 */
public class DirectionCourse implements Observable {

    /**
     * Liste des observateurs enregistrés.
     */
    private final List<Observateur> observateurs = new ArrayList<>();

    /**
     * Liste des abandons enregistrés.
     */
    private final List<Abandon> abandons = new ArrayList<>();

    /**
     * Constructeur par défaut pour créer une instance de DirectionCourse.
     */
    public DirectionCourse() {
        // Constructeur vide par défaut
    }

    /**
     * Ajoute un nouvel abandon et informe les observateurs.
     *
     * @param abandon l'abandon à ajouter
     */
    private void nouvelAbandon(Abandon abandon) {
        abandons.add(abandon);
        informeObservateurs();
    }

    /**
     * Simule une course en ajoutant des abandons au fur et à mesure.
     *
     * @param abandons un ensemble d'abandons à simuler
     */
    public void simulationCourse(HashSet<Abandon> abandons) {
        for (Iterator<Abandon> i = abandons.iterator(); i.hasNext();) {
            this.abandons.add(i.next());
            informeObservateurs();
            try {
                Thread.sleep(2 * 1000); // Pause de 2 secondes
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Enregistre un observateur pour être notifié des changements.
     *
     * @param o l'observateur à enregistrer
     */
    public void enregistreObservateur(Observateur o) {
        observateurs.add(o);
    }

    /**
     * Désenregistre un observateur pour qu'il ne soit plus notifié des changements.
     *
     * @param o l'observateur à désenregistrer
     */
    public void desenregistreObservateur(Observateur o) {
        observateurs.remove(o);
    }

    /**
     * Informe tous les observateurs enregistrés d'un changement.
     */
    public void informeObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(this);
        }
    }

    /**
     * Obtient le dernier abandon ajouté.
     *
     * @return le dernier abandon
     */
    public Abandon getLastAbandon() {
        return abandons.get(abandons.size() - 1); // Correction pour éviter une erreur
    }
}

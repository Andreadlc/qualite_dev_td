package observateur;

import java.util.Observer;

/**
 * Interface représentant un objet observable dans le modèle Observateur.
 * Les objets qui implémentent cette interface peuvent enregistrer, désenregistrer
 * et informer des observateurs des changements d'état.
 */
public interface Observable {

    /**
     * Enregistre un observateur pour être notifié des changements.
     *
     * @param observateur l'observateur à enregistrer
     */
    public void enregistreObservateur(Observateur observateur);

    /**
     * Désenregistre un observateur pour qu'il ne soit plus notifié des changements.
     *
     * @param observateur l'observateur à désenregistrer
     */
    public void desenregistreObservateur(Observateur observateur);

    /**
     * Informe tous les observateurs enregistrés d'un changement.
     */
    public void informeObservateurs();
}

package observateur;

/**
 * Interface représentant un observateur dans le modèle Observateur.
 * Les classes qui implémentent cette interface peuvent être notifiées
 * des changements d'état des objets observables auxquels elles sont enregistrées.
 */
public interface Observateur {

    /**
     * Méthode appelée lorsque l'objet observable subit un changement d'état.
     *
     * @param observable l'objet observable qui a changé d'état
     */
    public void actualise(Observable observable);
}

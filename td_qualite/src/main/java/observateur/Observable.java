package observateur;

import java.util.Observer;

public interface Observable {
    public void enregistreObservateur(Observateur observateur);
    public void desenregistreObservateur(Observateur observateur);
    public void informeObservateurs();
}

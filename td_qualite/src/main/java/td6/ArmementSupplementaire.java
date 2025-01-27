package td6;

import td5.SuivreRoute;
import td5.Voilier;

public abstract class ArmementSupplementaire extends Voilier {

    protected Voilier voilierdecore;


    public ArmementSupplementaire(Voilier voilierdecore) {
        super();
        this.voilierdecore = voilierdecore;

    }

    @Override
    public void setSuivreRoute(SuivreRoute suivreRoute){
        voilierdecore.setSuivreRoute(suivreRoute);
    }

    @Override
    public void appliqueSuivreRoute(){
        voilierdecore.appliqueSuivreRoute();
    }
}

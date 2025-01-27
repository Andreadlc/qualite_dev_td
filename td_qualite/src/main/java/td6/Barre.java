package td6;

import td5.Voilier;

public class Barre extends ArmementSupplementaire{

    public Barre(Voilier voilier){
        super(voilier);
    }

    @Override
    public String toString() {
        return voilierdecore.toString() + " barre";
    }
}

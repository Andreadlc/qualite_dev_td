package td6;

import td5.Voilier;

public class Velo extends ArmementSupplementaire{

    public Velo(Voilier voilier){
        super(voilier);
    }

    @Override
    public String toString() {
        return voilierdecore.toString() + " vélo";
    }
}

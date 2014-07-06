package com.kevinquan.cwa.model.creatures.rainbow;

public class ImprovedSugarImp extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = ImprovedSugarImp.class.getSimpleName();
    
    public ImprovedSugarImp() {
        super("Improved Sugar Imp", 1, Rarity.Cool);
        mDescription = "Heal adjacent creatures 2 points";
    }

    @Override public int getInitialAttack() { return 1; }
    @Override public int getInitialDefense() { return 4; }
    @Override public int getFloopCost() { return 1; }

}

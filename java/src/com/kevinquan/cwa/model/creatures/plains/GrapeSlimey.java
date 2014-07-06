package com.kevinquan.cwa.model.creatures.plains;

public class GrapeSlimey extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = GrapeSlimey.class.getSimpleName();
    
    public GrapeSlimey() {
        super("Grape Slimey", 1, Rarity.Cool);
        mDescription = "Draw 1 card and send this creature to the Discard Pile";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 1; }

}

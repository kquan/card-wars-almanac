package com.kevinquan.cwa.model.creatures.plains;

public class AncientScholar extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = AncientScholar.class.getSimpleName();
    
    public AncientScholar() {
        super("Ancient Scholar", 2, Rarity.Nice);
        mDescription = "Return a creature from the Discard Pile to your hand";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 13; }
    @Override public int getFloopCost() { return 3; }

}

package com.kevinquan.cwa.model.creatures.plains;

public class DragonClaw extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = DragonClaw.class.getSimpleName();
    
    public DragonClaw() {
        super("Ancient Scholar", 2, Rarity.Nice);
        mDescription = "Return a Building from the Discard Pile to your hand";
    }

    @Override public int getInitialAttack() { return 5; }
    @Override public int getInitialDefense() { return 15; }
    @Override public int getFloopCost() { return 2; }

}

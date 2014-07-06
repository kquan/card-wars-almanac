package com.kevinquan.cwa.model.creatures.plains;

public class CoolDog extends AbstractPlainsCreature {

    @SuppressWarnings("unused")
    private static final String TAG = CoolDog.class.getSimpleName();
    
    public CoolDog() {
        super("Cool Dog", 1, Rarity.Cool);
        mDescription = "Creature in opposing lane cannot use its Floop ability next turn";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 7; }
    @Override public int getFloopCost() { return 1; }

}

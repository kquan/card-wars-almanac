package com.kevinquan.cwa.model.creatures.rainbow;

public class Mouthball extends AbstractRainbowCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Mouthball.class.getSimpleName();
    
    public Mouthball() {
        super(Mouthball.class.getSimpleName(), 1, Rarity.Cool);
        mDescription = "Creature in opposing lane cannot use Floop ability next turn";
    }

    @Override public int getInitialAttack() { return 3; }
    @Override public int getInitialDefense() { return 2; }
    @Override public int getFloopCost() { return 2; }

}

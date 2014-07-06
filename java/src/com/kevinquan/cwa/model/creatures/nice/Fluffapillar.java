package com.kevinquan.cwa.model.creatures.nice;

public class Fluffapillar extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = Fluffapillar.class.getSimpleName();
    
    public Fluffapillar() {
        super(Fluffapillar.class.getSimpleName(), 1, Rarity.Cool);
        mDescription = "Heal adjacent creatures 3 points";
    }

    @Override public int getInitialAttack() { return 2; }
    @Override public int getInitialDefense() { return 5; }
    @Override public int getFloopCost() { return 2; }

}

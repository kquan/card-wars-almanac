package com.kevinquan.cwa.model.creatures.nice;

public class TravelinWizard extends AbstractNiceCreature {

    @SuppressWarnings("unused")
    private static final String TAG = TravelinWizard.class.getSimpleName();
    
    public TravelinWizard() {
        super("Travelin' Wizard", 4, Rarity.VeryRare);
        mDescription = "Heal 12 Damage from a random creature on the field (including opponents)";
    }

    @Override public int getInitialAttack() { return 12; }
    @Override public int getInitialDefense() { return 23; }
    @Override public int getFloopCost() { return 1; }

}

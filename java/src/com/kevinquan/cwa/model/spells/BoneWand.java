package com.kevinquan.cwa.model.spells;

public class BoneWand extends AbstractSpellCard {

    @SuppressWarnings("unused")
    private static final String TAG = BoneWand.class.getSimpleName();
    
    public BoneWand() {
        super("Bone Wand", 2, Rarity.Nice);
        mDescription = "Choose a Useless Swamp creature and attack the opposing creature in its lane";
    }

}

package com.kevinquan.cwa.model;


public interface Card {
    
    public enum Faction {
        Corn,
        Blue,
        Nice,
        Swamp,
        Sandy,
        Rainbow,
        ;
    }
    
    public enum Rarity {
        Cool,
        Nice,
        ;
    }

    String getName();
    
    int getCost();
    Faction getFaction();
    Rarity getRarity();
   
}

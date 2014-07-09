package com.kevinquan.cwa.model;


public interface Card {
    
    public enum Faction {
        CornFields,
        BluePlains,
        NiceLands,
        UselessSwamp,
        SandyLands,
        Rainbow,
        ;
    }
    
    public enum Rarity {
        Cool(1),
        Nice(2),
        Rare(3),
        VeryRare(4),
        AlgebraicRare(5),
        ;
        
        protected int mNumberOfStars;
        
        private Rarity(int stars) {
            mNumberOfStars = stars;
        }
        
        public int getStars() {
            return mNumberOfStars;
        }
    }

    String getId();
    String getName();
    String getDescription();
    
    int getCost();
    Faction getFaction();
    Rarity getRarity();
   
}

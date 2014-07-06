package com.kevinquan.cwa.model.hero;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Hero {

    @SuppressWarnings("unused")
    private static final String TAG = Hero.class.getSimpleName();
    
    public static final Hero JAKE = new Hero("Jake", 3, "All your corn creatures gain +3 Attack");
    public static final Hero FINN = new Hero("Finn", 5, "Gain 2 extra Magic Points for 1 turn");
    public static final Hero BMO = new Hero("BMO", 3, "Gain 2 extra Magic Points for 1 turn");
    public static final Hero MARCELINE = new Hero("Marceline", 3, "All of your creatures gain +2 Attack");
    public static final Hero PRINCESS_BUBBLEGUM = new Hero("Princess Bubblegum", 4, "Fully heal all of your creatures");
    public static final Hero FLAME_PRINCESS = new Hero("Flame Princess", 4, "Draw 2 cards");
    public static final Hero LADY_RAINICORN = new Hero("Lady Rainicorn", 3, "Choose a creature and fully heal it");
    public static final Hero LUMPY_SPACE_PRINCESS = new Hero("Lumpy Space Princess", 3, "Fully heal all of your Plains creatures");
    public static final Hero ASH = new Hero("Ash", 4, "Return any card from the Discard Pile back to your hand");
    
    protected static Hashtable<String, Hero> ALL_HEROES;
    
    static {
        ALL_HEROES = new Hashtable<String, Hero>();
        ALL_HEROES.put(JAKE.getName(), JAKE);
        ALL_HEROES.put(FINN.getName(), FINN);
        ALL_HEROES.put(BMO.getName(), BMO);
        ALL_HEROES.put(MARCELINE.getName(), MARCELINE);
        ALL_HEROES.put(PRINCESS_BUBBLEGUM.getName(), PRINCESS_BUBBLEGUM);
        ALL_HEROES.put(FLAME_PRINCESS.getName(), FLAME_PRINCESS);
        ALL_HEROES.put(LADY_RAINICORN.getName(), LADY_RAINICORN);
        ALL_HEROES.put(LUMPY_SPACE_PRINCESS.getName(), LUMPY_SPACE_PRINCESS);
        ALL_HEROES.put(ASH.getName(), ASH);
    }
    
    public static List<Hero> getAllHeroes() {
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.addAll(ALL_HEROES.values());
        return heroes;
    }
    
    public static Hero getHero(String name) {
        return ALL_HEROES.get(name);
    }
    
    protected String mName;
    protected String mAbility;
    protected int mAbilityPeriod;
    
    protected Hero(String name, int abilityPeriod, String ability) {
        mName = name;
        mAbilityPeriod = abilityPeriod;
        mAbility = ability;
    }

    public String getName() {
        return mName;
    }

    public String getAbility() {
        return mAbility;
    }

    public int getAbilityPeriod() {
        return mAbilityPeriod;
    }

}

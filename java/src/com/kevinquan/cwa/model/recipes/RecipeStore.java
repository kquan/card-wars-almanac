package com.kevinquan.cwa.model.recipes;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.WizardMigrane;

public class RecipeStore {

    @SuppressWarnings("unused")
    private static final String TAG = RecipeStore.class.getSimpleName();

    private static class RecipeStoreHolder {
        private static final RecipeStore INSTANCE = new RecipeStore();
    }
    
    public static RecipeStore getInstance() {
        return RecipeStoreHolder.INSTANCE;
    }
    
    protected List<Recipe> mRecipies;
    
    private RecipeStore() {
        mRecipies = new ArrayList<Recipe>();
        init();
    }
    
    protected RecipeStore addRecipe(Recipe recipe) {
        mRecipies.add(recipe);
        return this;
    }
    
    protected void init() {
        addRecipe(new Recipe(new CornDome(), new CerebralBloodstorm(), 95, new AstralFortress()));
        addRecipe(new Recipe(new Cornball(), new WanderingBaldMan(), 50, new TravelinFarmer()));
        // Sand angel
        addRecipe(new Recipe(new GrapeSlimey(), new WizardMigrane(), 200, new Poultrygeist()));
    }
    
    public List<Recipe> getRecipesThatUse(Card card) {
        List<Recipe> recipes = new ArrayList<Recipe>();
        for (Recipe recipe : mRecipies) {
            if (recipe.uses(card)) {
                recipes.add(recipe);
            }
        }
        return recipes;
    }
    
    public List<Recipe> getRecipeThatCreates(Card card) {
        List<Recipe> recipes = new ArrayList<Recipe>();
        for (Recipe recipe : mRecipies) {
            if (recipe.getResult().getClass().isInstance(card)) {
                recipes.add(recipe);
            }
        }
        return recipes;
    }
}

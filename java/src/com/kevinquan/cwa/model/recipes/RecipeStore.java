package com.kevinquan.cwa.model.recipes;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.buildings.SandCastle;
import com.kevinquan.cwa.model.buildings.WoadMobileHome;
import com.kevinquan.cwa.model.creatures.corn.ArcherDan;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.NicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.creatures.rainbow.WhiteNinja;
import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.LimeSlimey;
import com.kevinquan.cwa.model.creatures.sandy.MayonaiseAngel;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.SandSnake;
import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GreenMerman;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;
import com.kevinquan.cwa.model.spells.BoneWand;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.CornScepter;
import com.kevinquan.cwa.model.spells.CrystalBall;
import com.kevinquan.cwa.model.spells.FountainOfForgiveness;
import com.kevinquan.cwa.model.spells.GrapeButt;
import com.kevinquan.cwa.model.spells.PsychicTempest;
import com.kevinquan.cwa.model.spells.PumaClaw;
import com.kevinquan.cwa.model.spells.ScrollOfFreshBreath;
import com.kevinquan.cwa.model.spells.StrawberryButt;
import com.kevinquan.cwa.model.spells.SuperHug;
import com.kevinquan.cwa.model.spells.Teleport;
import com.kevinquan.cwa.model.spells.TomeOfAnkhs;
import com.kevinquan.cwa.model.spells.UfoAbduction;
import com.kevinquan.cwa.model.spells.WizardMigrane;
import com.kevinquan.cwa.model.spells.WoadBlood;

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
        addRecipe(new Recipe(new AngelHeart(), new HeavenlyGazer(), 165, new SandAngel()));
        addRecipe(new Recipe(new GrapeSlimey(), new WizardMigrane(), 200, new Poultrygeist()));
        addRecipe(new Recipe(new SandEyebat(), new OrangeSlimey(), 275, new GrayEyebat()));
        addRecipe(new Recipe(new TeethLeaf(), new GrapeSlimey(), 300, new MaceStump()));
        addRecipe(new Recipe(new CerebralBloodstorm(), new WizardMigrane(), 325, new Teleport()));
        addRecipe(new Recipe(new StrawberryButt(), new EthanAllfire(), 350, new ImprovedSugarImp()));
        addRecipe(new Recipe(new Teleport(), new CornDome(), new AstralFortress(), 350, new UfoAbduction()));
        addRecipe(new Recipe(new CrystalBall(), new StrawberryButt(), new Teleport(), 400, new BlueberryDjini()));
        addRecipe(new Recipe(new TravelinFarmer(), new CerebralBloodstorm(), 450, new HuskerKnight()));
        addRecipe(new Recipe(new AstralFortress(), new SandAngel(), 525, new SandCastle()));
        addRecipe(new Recipe(new WanderingBaldMan(), new WoadBlood(), 600, new WoadicTimeWalker()));
        addRecipe(new Recipe(new Fluffapillar(), new AngelHeart(), 700, new NiceIceBaby()));
        addRecipe(new Recipe(new GreenCactaball(), new HeavenlyGazer(), 750, new SandEyebat()));
        addRecipe(new Recipe(new WanderingBaldMan(), new AngelHeart(), new WizardMigrane(), 800, new FairyShepard()));
        addRecipe(new Recipe(new BurningHand(), new UfoAbduction(), 900, new TravelinSkeleton()));
        addRecipe(new Recipe(new WoadicTimeWalker(), new MsMummy(), 925, new OrdinaryNinja()));
        addRecipe(new Recipe(1000, new GrapeButt()).addIngredient(new StrawberryButt()).addIngredient(new GrapeSlimey(), 2).addIngredient(new WizardMigrane()));
        addRecipe(new Recipe(new WanderingBaldMan(), new FountainOfForgiveness(), new BoneWand(), 1700, new GreenMerman()));
        addRecipe(new Recipe(new WizardMigrane(), new BoneWand(), new HeavenlyGazer(), 2300, new EvilEye()));
        addRecipe(new Recipe(new CerebralBloodstorm(), new WizardMigrane(), new Teleport(), 3800, new PsychicTempest()));
        addRecipe(new Recipe(3300, new AncientScholar()).addIngredient(new TomeOfAnkhs(), 3).addIngredient(new WizardMigrane(), 3).addIngredient(new WanderingBaldMan()));
        addRecipe(new Recipe(4500, new LimeSlimey()).addIngredient(new GrapeSlimey(), 3).addIngredient(new TomeOfAnkhs()).addIngredient(new Teleport()));
        addRecipe(new Recipe(5000, new SandSnake()).addIngredient(new HuskerWorm()).addIngredient(new MsMummy(), 2).addIngredient(new TomeOfAnkhs()));
        addRecipe(new Recipe(new BurningHand(), new PumaClaw(), 5500, new DragonClaw()).addIngredient(new GrapeSlimey(), 3));
        addRecipe(new Recipe(6000, new WoadMobileHome()).addIngredient(new CornDome()).addIngredient(new WoadicTimeWalker(), 2).addIngredient(new PumaClaw()));
        addRecipe(new Recipe(6100, new WhiteNinja()).addIngredient(new OrdinaryNinja()).addIngredient(new Fluffapillar(), 3).addIngredient(new ScrollOfFreshBreath()));
        addRecipe(new Recipe(2000, new MayonaiseAngel()).addIngredient(new SandAngel()).addIngredient(new Fluffapillar(), 3).addIngredient(new FountainOfForgiveness(), 2));
        addRecipe(new Recipe(6300, new ArcherDan()).addIngredient(new TravelinFarmer()).addIngredient(new Cornball(), 3).addIngredient(new CornScepter()));
        addRecipe(new Recipe(6100, new Axey()).addIngredient(new MaceStump(), 3).addIngredient(new TeethLeaf(), 3).addIngredient(new BoneWand()));
        addRecipe(new Recipe(7000, new NicelandsEyeBat()).addIngredient(new GrayEyebat()).addIngredient(new SandEyebat()).addIngredient(new SuperHug(), 2));
        addRecipe(new Recipe(7500, new HotEyebat()).addIngredient(new NicelandsEyeBat()).addIngredient(new HeavenlyGazer()).addIngredient(new EthanAllfire(), 3));
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
    
    public int getCount() {
        return mRecipies.size();
    }
}

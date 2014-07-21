/*
 * Copyright 2014 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevinquan.cwa.model.recipes;

import java.util.ArrayList;
import java.util.List;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.CaveOfSolitude;
import com.kevinquan.cwa.model.buildings.ComfyCave;
import com.kevinquan.cwa.model.buildings.CornCastle;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.buildings.CornParthenon;
import com.kevinquan.cwa.model.buildings.NicelandsTower;
import com.kevinquan.cwa.model.buildings.ObelisxOfVengence;
import com.kevinquan.cwa.model.buildings.PalaceOfBone;
import com.kevinquan.cwa.model.buildings.PuffyCastle;
import com.kevinquan.cwa.model.buildings.Pyramidia;
import com.kevinquan.cwa.model.buildings.SandCastle;
import com.kevinquan.cwa.model.buildings.SandPyramid;
import com.kevinquan.cwa.model.buildings.SandSphinx;
import com.kevinquan.cwa.model.buildings.SchoolHouse;
import com.kevinquan.cwa.model.buildings.SiloOfTruth;
import com.kevinquan.cwa.model.buildings.SpiritTower;
import com.kevinquan.cwa.model.buildings.WoadMobileHome;
import com.kevinquan.cwa.model.creatures.Creature;
import com.kevinquan.cwa.model.creatures.corn.ArcherDan;
import com.kevinquan.cwa.model.creatures.corn.CornDog;
import com.kevinquan.cwa.model.creatures.corn.CornLord;
import com.kevinquan.cwa.model.creatures.corn.CornRonin;
import com.kevinquan.cwa.model.creatures.corn.Cornataur;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.FieldReaper;
import com.kevinquan.cwa.model.creatures.corn.FieldStalker;
import com.kevinquan.cwa.model.creatures.corn.HuskerGiant;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.Huskerbat;
import com.kevinquan.cwa.model.creatures.corn.LegionOfEarlings;
import com.kevinquan.cwa.model.creatures.corn.PatchyThePumpkin;
import com.kevinquan.cwa.model.creatures.corn.TheSludger;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.WallOfEars;
import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.DetectiveBobby;
import com.kevinquan.cwa.model.creatures.nice.DogBoy;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.FarmerTom;
import com.kevinquan.cwa.model.creatures.nice.FatGoat;
import com.kevinquan.cwa.model.creatures.nice.Fluffantry;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.GoodKingWonderful;
import com.kevinquan.cwa.model.creatures.nice.MotherFluffBucket;
import com.kevinquan.cwa.model.creatures.nice.NicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.nice.SgtMushroom;
import com.kevinquan.cwa.model.creatures.nice.SnakeMint;
import com.kevinquan.cwa.model.creatures.nice.SnuggleTree;
import com.kevinquan.cwa.model.creatures.nice.SoftEyeling;
import com.kevinquan.cwa.model.creatures.nice.TheCow;
import com.kevinquan.cwa.model.creatures.nice.TravelinWizard;
import com.kevinquan.cwa.model.creatures.nice.WellDressedWolf;
import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.DragonFoot;
import com.kevinquan.cwa.model.creatures.plains.EmbarrassingBard;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Heifergeist;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.PsionicArchitect;
import com.kevinquan.cwa.model.creatures.plains.PunkCat;
import com.kevinquan.cwa.model.creatures.plains.StruzannJinn;
import com.kevinquan.cwa.model.creatures.plains.TemporalWisp;
import com.kevinquan.cwa.model.creatures.plains.WoadicChief;
import com.kevinquan.cwa.model.creatures.plains.WoadicMarauder;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.plains.XLargeSpiritSoldier;
import com.kevinquan.cwa.model.creatures.rainbow.BigFoot;
import com.kevinquan.cwa.model.creatures.rainbow.DetectiveSally;
import com.kevinquan.cwa.model.creatures.rainbow.DroolingDude;
import com.kevinquan.cwa.model.creatures.rainbow.Earl;
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.FreezyJ;
import com.kevinquan.cwa.model.creatures.rainbow.FutureScholar;
import com.kevinquan.cwa.model.creatures.rainbow.GhostNinja;
import com.kevinquan.cwa.model.creatures.rainbow.GreenSnakey;
import com.kevinquan.cwa.model.creatures.rainbow.IcePaladin;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.PeachDjini;
import com.kevinquan.cwa.model.creatures.rainbow.Phyllis;
import com.kevinquan.cwa.model.creatures.rainbow.PorcelainGuardian;
import com.kevinquan.cwa.model.creatures.rainbow.Quadurai;
import com.kevinquan.cwa.model.creatures.rainbow.TheMariachi;
import com.kevinquan.cwa.model.creatures.rainbow.ThePickler;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.creatures.rainbow.WhiteNinja;
import com.kevinquan.cwa.model.creatures.sandy.BeachMum;
import com.kevinquan.cwa.model.creatures.sandy.BurningHand;
import com.kevinquan.cwa.model.creatures.sandy.Fummy;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.LimeSlimey;
import com.kevinquan.cwa.model.creatures.sandy.LostGolem;
import com.kevinquan.cwa.model.creatures.sandy.MayonaiseAngel;
import com.kevinquan.cwa.model.creatures.sandy.MsMummy;
import com.kevinquan.cwa.model.creatures.sandy.MudAngel;
import com.kevinquan.cwa.model.creatures.sandy.Pieclops;
import com.kevinquan.cwa.model.creatures.sandy.SandAngel;
import com.kevinquan.cwa.model.creatures.sandy.SandEyebat;
import com.kevinquan.cwa.model.creatures.sandy.SandJackal;
import com.kevinquan.cwa.model.creatures.sandy.SandKnight;
import com.kevinquan.cwa.model.creatures.sandy.SandSnake;
import com.kevinquan.cwa.model.creatures.sandy.Sandfoot;
import com.kevinquan.cwa.model.creatures.sandy.Sandwitch;
import com.kevinquan.cwa.model.creatures.sandy.Sandy;
import com.kevinquan.cwa.model.creatures.sandy.WallOfSand;
import com.kevinquan.cwa.model.creatures.swamp.DarkAngel;
import com.kevinquan.cwa.model.creatures.swamp.DrDeath;
import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GreenMermaid;
import com.kevinquan.cwa.model.creatures.swamp.GreenMerman;
import com.kevinquan.cwa.model.creatures.swamp.Herculeye;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.ImmortalMaizeWalker;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.MamaSpider;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.RainbowBarfer;
import com.kevinquan.cwa.model.creatures.swamp.RecordThug;
import com.kevinquan.cwa.model.creatures.swamp.RedEyeling;
import com.kevinquan.cwa.model.creatures.swamp.SnappyDresser;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.TreeOfUnderneath;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;
import com.kevinquan.cwa.model.spells.BananaButt;
import com.kevinquan.cwa.model.spells.BoneWand;
import com.kevinquan.cwa.model.spells.BriefPower;
import com.kevinquan.cwa.model.spells.BubblegumButt;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.ClairvoyantDaggerstorm;
import com.kevinquan.cwa.model.spells.CornScepter;
import com.kevinquan.cwa.model.spells.CoughSyrup;
import com.kevinquan.cwa.model.spells.CrystalBall;
import com.kevinquan.cwa.model.spells.DarkPortal;
import com.kevinquan.cwa.model.spells.DoorOfStrength;
import com.kevinquan.cwa.model.spells.FallingStar;
import com.kevinquan.cwa.model.spells.FieldOfNightmares;
import com.kevinquan.cwa.model.spells.FountainOfForgiveness;
import com.kevinquan.cwa.model.spells.GrapeButt;
import com.kevinquan.cwa.model.spells.HotDogRain;
import com.kevinquan.cwa.model.spells.PieStorm;
import com.kevinquan.cwa.model.spells.PortalToNowhere;
import com.kevinquan.cwa.model.spells.PsychicTempest;
import com.kevinquan.cwa.model.spells.PumaClaw;
import com.kevinquan.cwa.model.spells.ScrollOfBadBreath;
import com.kevinquan.cwa.model.spells.ScrollOfFreshBreath;
import com.kevinquan.cwa.model.spells.SkullJuice;
import com.kevinquan.cwa.model.spells.SnakeEyeRing;
import com.kevinquan.cwa.model.spells.SpiritTorch;
import com.kevinquan.cwa.model.spells.StrawberryButt;
import com.kevinquan.cwa.model.spells.SuperHug;
import com.kevinquan.cwa.model.spells.Teleport;
import com.kevinquan.cwa.model.spells.ThroneOfDoom;
import com.kevinquan.cwa.model.spells.ThroneOfGloom;
import com.kevinquan.cwa.model.spells.TomeOfAnkhs;
import com.kevinquan.cwa.model.spells.UfoAbduction;
import com.kevinquan.cwa.model.spells.UltimateMagicHands;
import com.kevinquan.cwa.model.spells.UnemptyCoffin;
import com.kevinquan.cwa.model.spells.Volcano;
import com.kevinquan.cwa.model.spells.WitchWay;
import com.kevinquan.cwa.model.spells.WizardMigrane;
import com.kevinquan.cwa.model.spells.WizardRawk;
import com.kevinquan.cwa.model.spells.WoadBlood;
import com.kevinquan.cwa.model.spells.ZaZosMagicSeeds;

public class RecipeStore {

    private static class RecipeStoreHolder {
        private static final RecipeStore INSTANCE = new RecipeStore();
    }

    @SuppressWarnings("unused")
    private static final String TAG = RecipeStore.class.getSimpleName();
    
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
    
    public int getCount() {
        return mRecipies.size();
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
                if (card instanceof Creature && ((Creature)recipe.getResult()).isGold() != ((Creature)card).isGold()) {
                    continue;
                }
                recipes.add(recipe);
            }
        }
        return recipes;
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
        addRecipe(new Recipe(new EvilEye(), new BoneWand(), new SuperHug(), 8000, new Herculeye()));
        addRecipe(new Recipe(new SandCastle(), new TomeOfAnkhs(), new AstralFortress(), 8200, new Pyramidia()));
        addRecipe(new Recipe(8700, new SnuggleTree()).addIngredient(new Axey()).addIngredient(new MaceStump(), 2).addIngredient(new SuperHug()));
        addRecipe(new Recipe(new BlueberryDjini(), new FountainOfForgiveness(), new ScrollOfFreshBreath(), 9000, new PeachDjini()));
        addRecipe(new Recipe(new GreenSnakey(), new SandSnake(), new ScrollOfFreshBreath(), 10000, new SnakeMint()));
        addRecipe(new Recipe(1000, new CornDog()).addIngredient(new CoolDog()).addIngredient(new Cornball(), 3).addIngredient(new CornScepter()));
        addRecipe(new Recipe(9500, new WallOfEars()).addIngredient(new Cornball(),3 ).addIngredient(new HuskerWorm(), 3).addIngredient(new CornScepter()));
        addRecipe(new Recipe(new CornDome(), new AstralFortress(), new CornScepter(), 9700, new CornCastle()));
        addRecipe(new Recipe(new Teleport(), new BoneWand(), new AncientScholar(), 11000, new DarkPortal()));
        addRecipe(new Recipe(new WanderingBaldMan(), new Axey(), 17000, new BigFoot()).addIngredient(new WoadBlood(), 5));
        addRecipe(new Recipe(21000, new Earl()).addIngredient(new SnappyDresser()).addIngredient(new UfoAbduction(), 3).addIngredient(new Teleport(), 3));
        addRecipe(new Recipe(new AncientScholar(), new Pyramidia(), new WizardMigrane(), 24000, new FallingStar()));
        
        addRecipe(new Recipe(29000, new PalaceOfBone())
                .addIngredient(new TravelinSkeleton())
                .addIngredient(new MaceStump())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(35000, new WallOfSand())
                .addIngredient(new WallOfEars(), 3)
                .addIngredient(new SandCastle(), 3)
                .addIngredient(new TomeOfAnkhs(), 3));
        addRecipe(new Recipe(40000, new PsionicArchitect())
                .addIngredient(new AncientScholar())
                .addIngredient(new FallingStar())
                .addIngredient(new WoadBlood()));
        addRecipe(new Recipe(57000, new GreenMermaid())
                .addIngredient(new GreenMerman())
                .addIngredient(new FallingStar(), 3)
                .addIngredient(new WizardMigrane(), 3));
        addRecipe(new Recipe(63000, new Sandfoot())
                .addIngredient(new BigFoot())
                .addIngredient(new SandSnake(), 5)
                .addIngredient(new TomeOfAnkhs(), 2));
        addRecipe(new Recipe(69000, new IcePaladin())
                .addIngredient(new HuskerKnight())
                .addIngredient(new FreezyJ(), 4)
                .addIngredient(new DetectiveBobby(), 3));
        addRecipe(new Recipe(71000, new TheSludger())
                .addIngredient(new IcePaladin())
                .addIngredient(new MaceStump())
                .addIngredient(new CornScepter(), 5));
        addRecipe(new Recipe(74000, new SandPyramid())
                .addIngredient(new Pyramidia())
                .addIngredient(new SandCastle())
                .addIngredient(new WallOfSand()));
        addRecipe(new Recipe(80000, new TheCow())
                .addIngredient(new FatGoat(), 2)
                .addIngredient(new FairyShepard(), 3)
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(81000, new PatchyThePumpkin())
                .addIngredient(new OrangeSlimey(), 6)
                .addIngredient(new FieldOfNightmares())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(83000, new RedEyeling())
                .addIngredient(new SoftEyeling(), 2)
                .addIngredient(new FieldOfNightmares(), 2)
                .addIngredient(new DarkPortal(), 2));
        addRecipe(new Recipe(91000, new ComfyCave())
                .addIngredient(new CornDome())
                .addIngredient(new SuperHug())
                .addIngredient(new FountainOfForgiveness()));
        addRecipe(new Recipe(100000, new TemporalWisp())
                .addIngredient(new HuskerKnight())
                .addIngredient(new FieldOfNightmares())
                .addIngredient(new ClairvoyantDaggerstorm(), 3));
        addRecipe(new Recipe(110000, new Cornataur())
                .addIngredient(new CornDog(), 3)
                .addIngredient(new IcePaladin())
                .addIngredient(new DarkPortal(), 3));
        addRecipe(new Recipe(150000, new DarkAngel())
                .addIngredient(new MayonaiseAngel(), 3)
                .addIngredient(new FieldOfNightmares())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(225000, new FarmerTom())
                .addIngredient(new FairyShepard())
                .addIngredient(new TheCow(), 3)
                .addIngredient(new FatGoat(), 5));
        addRecipe(new Recipe(300000, new DragonFoot())
                .addIngredient(new BigFoot())
                .addIngredient(new DragonClaw())
                .addIngredient(new FallingStar(), 3));
        addRecipe(new Recipe(375000, new Fummy())
                .addIngredient(new BeachMum(), 3)
                .addIngredient(new TomeOfAnkhs(), 5)
                .addIngredient(new SandPyramid(), 2));
        addRecipe(new Recipe(450000, new BananaButt())
                .addIngredient(new BubblegumButt(), 2)
                .addIngredient(new GrapeButt(), 2)
                .addIngredient(new StrawberryButt(), 2));
        addRecipe(new Recipe(500000, new SandSphinx())
                .addIngredient(new SandPyramid())
                .addIngredient(new TheCow(), 2)
                .addIngredient(new DarkPortal(), 2));
        addRecipe(new Recipe(525000, new WoadicMarauder())
                .addIngredient(new PsionicArchitect(), 3)
                .addIngredient(new WoadicTimeWalker(), 3)
                .addIngredient(new WoadBlood(), 3));
        addRecipe(new Recipe(600000, new MamaSpider())
                .addIngredient(new DetectiveSally())
                .addIngredient(new SnakeMint(), 5)
                .addIngredient(new BoneWand(), 3));
        addRecipe(new Recipe(650000, new FieldReaper())
                .addIngredient(new TheSludger(), 3)
                .addIngredient(new FieldOfNightmares(), 3)
                .addIngredient(new Axey(), 3));
        addRecipe(new Recipe(700000, new Sandwitch())
                .addIngredient(new PsionicArchitect())
                .addIngredient(new PeachDjini(), 3)
                .addIngredient(new TomeOfAnkhs(), 3));
        addRecipe(new Recipe(800000, new TravelinWizard())
                .addIngredient(new TravelinSkeleton())
                .addIngredient(new PsionicArchitect(), 3)
                .addIngredient(new WitchWay(), 2));
        addRecipe(new Recipe(900000, new Quadurai())
                .addIngredient(new GhostNinja(), 4)
                .addIngredient(new WhiteNinja(), 4)
                .addIngredient(new FallingStar(), 4));
        addRecipe(new Recipe(950000, new ThroneOfGloom())
                .addIngredient(new ComfyCave())
                .addIngredient(new DarkPortal(), 3)
                .addIngredient(new PortalToNowhere(), 3));
        addRecipe(new Recipe(1000000, new SpiritTorch())
                .addIngredient(new Volcano(), 5)
                .addIngredient(new PsionicArchitect(), 3)
                .addIngredient(new EthanAllfire()));
        addRecipe(new Recipe(1250000, new CaveOfSolitude())
                .addIngredient(new ComfyCave())
                .addIngredient(new FallingStar(), 3)
                .addIngredient(new BoneWand(), 3));
        addRecipe(new Recipe(2000000, new DrDeath())
                .addIngredient(new TravelinSkeleton())
                .addIngredient(new DarkPortal(), 7)
                .addIngredient(new UltimateMagicHands()));
        addRecipe(new Recipe(2500000, new ImmortalMaizeWalker())
                .addIngredient(new TravelinWizard(), 2)
                .addIngredient(new FieldOfNightmares(), 5)
                .addIngredient(new UfoAbduction(), 10));
        addRecipe(new Recipe(3000000, new LostGolem())
                .addIngredient(new CaveOfSolitude())
                .addIngredient(new ZaZosMagicSeeds())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(3500000, new Fluffantry())
                .addIngredient(new FatGoat(), 10)
                .addIngredient(new FarmerTom(), 5)
                .addIngredient(new BriefPower(), 2));
        addRecipe(new Recipe(4000000, new EmbarrassingBard())
                .addIngredient(new SnappyDresser())
                .addIngredient(new ScrollOfFreshBreath(), 10)
                .addIngredient(new SchoolHouse()));
        addRecipe(new Recipe(4500000, new PorcelainGuardian())
                .addIngredient(new ThroneOfDoom(), 3)
                .addIngredient(new PortalToNowhere(), 3)
                .addIngredient(new ThroneOfGloom(), 5));
        addRecipe(new Recipe(5000000, new DroolingDude())
                .addIngredient(new ThePickler())
                .addIngredient(new BriefPower())
                .addIngredient(new ZaZosMagicSeeds()));
        addRecipe(new Recipe(6000000, new ObelisxOfVengence())
                .addIngredient(new SiloOfTruth())
                .addIngredient(new SandSphinx(), 3)
                .addIngredient(new WallOfSand(), 8));
        addRecipe(new Recipe(7000000, new HuskerGiant())
                .addIngredient(new ArcherDan(), 10)
                .addIngredient(new FieldOfNightmares(), 5)
                .addIngredient(new ZaZosMagicSeeds()));
        addRecipe(new Recipe(8000000, new GoodKingWonderful())
                .addIngredient(new FairyShepard())
                .addIngredient(new FallingStar(), 10)
                .addIngredient(new NicelandsTower(), 4));
        addRecipe(new Recipe(9000000, new XLargeSpiritSoldier())
                .addIngredient(new IcePaladin())
                .addIngredient(new PieStorm(), 5)
                .addIngredient(new ThePickler(), 5));
        addRecipe(new Recipe(9500000, new LegionOfEarlings())
                .addIngredient(new HuskerGiant())
                .addIngredient(new Cornataur())
                .addIngredient(new HuskerKnight()));
        addRecipe(new Recipe(9500000, new Sandy())
                .addIngredient(new Sandwitch(), 3)
                .addIngredient(new BriefPower(), 3)
                .addIngredient(new ZaZosMagicSeeds(), 3));
        addRecipe(new Recipe(9999999, new PuffyCastle())
                .addIngredient(new CornCastle(), 3)
                .addIngredient(new NicelandsTower(), 5)
                .addIngredient(new DoorOfStrength()));
        addRecipe(new Recipe(110000, new ThePig().setGold(true))
                .addIngredient(new ThePig(), 10));
        addRecipe(new Recipe(125000, new HeavenlyGazer().setGold(true))
                .addIngredient(new HeavenlyGazer(), 10));
        addRecipe(new Recipe(150000, new Heifergeist())
                .addIngredient(new TheCow(), 5)
                .addIngredient(new Sandwitch(), 3)
                .addIngredient(new ObelisxOfVengence()));
        addRecipe(new Recipe(200000, new MsMummy().setGold(true))
                .addIngredient(new MsMummy(), 10));
        addRecipe(new Recipe(225000, new WanderingBaldMan().setGold(true))
                .addIngredient(new WanderingBaldMan(), 10));
        addRecipe(new Recipe(275000, new Mouthball().setGold(true))
                .addIngredient(new Mouthball(), 10));
        addRecipe(new Recipe(300000, new Cornball().setGold(true))
                .addIngredient(new Cornball(), 10));
        addRecipe(new Recipe(350000, new CoolDog().setGold(true))
                .addIngredient(new CoolDog(), 10));
        addRecipe(new Recipe(375000, new Huskerbat())
                .addIngredient(new RedEyeling(), 5)
                .addIngredient(new EvilEye(), 5)
                .addIngredient(new Cornball(), 5));
        addRecipe(new Recipe(425000, new GrapeSlimey().setGold(true))
                .addIngredient(new GrapeSlimey(), 10));
        addRecipe(new Recipe(450000, new Fluffapillar().setGold(true))
                .addIngredient(new Fluffapillar(), 10));
        addRecipe(new Recipe(475000, new GreenCactaball().setGold(true))
                .addIngredient(new GreenCactaball(), 10));
        addRecipe(new Recipe(500000, new TeethLeaf().setGold(true))
                .addIngredient(new TeethLeaf(), 10));
        addRecipe(new Recipe(515000, new OrangeSlimey().setGold(true))
                .addIngredient(new OrangeSlimey(), 10));
        addRecipe(new Recipe(525000, new SandJackal())
                .addIngredient(new Sandfoot(), 5)
                .addIngredient(new Sandwitch(), 3)
                .addIngredient(new SandSphinx()));
        addRecipe(new Recipe(275000, new EthanAllfire().setGold(true))
                .addIngredient(new EthanAllfire(), 10));
        addRecipe(new Recipe(600000, new AngelHeart().setGold(true))
                .addIngredient(new AngelHeart(), 10));
        addRecipe(new Recipe(625000, new HuskerWorm().setGold(true))
                .addIngredient(new HuskerWorm(), 10));
        addRecipe(new Recipe(650000, new GreenSnakey().setGold(true))
                .addIngredient(new GreenSnakey(), 10));
        addRecipe(new Recipe(675000, new BurningHand().setGold(true))
                .addIngredient(new BurningHand(), 10));
        addRecipe(new Recipe(700000, new SoftEyeling().setGold(true))
                .addIngredient(new SoftEyeling(), 10));
        addRecipe(new Recipe(750000, new BeachMum().setGold(true))
                .addIngredient(new BeachMum(), 10));
        addRecipe(new Recipe(800000, new FatGoat().setGold(true))
                .addIngredient(new FatGoat(), 10));
        addRecipe(new Recipe(850000, new FreezyJ().setGold(true))
                .addIngredient(new FreezyJ(), 10));
        addRecipe(new Recipe(900000, new WellDressedWolf())
                .addIngredient(new SnappyDresser(), 5)
                .addIngredient(new FallingStar(), 3)
                .addIngredient(new GrapeButt(), 3));
        addRecipe(new Recipe(925000, new SnappyDresser().setGold(true))
                .addIngredient(new SnappyDresser(), 10));
        addRecipe(new Recipe(950000, new WhiteNinja().setGold(true))
                .addIngredient(new WhiteNinja(), 10));
        addRecipe(new Recipe(975000, new EvilEye().setGold(true))
                .addIngredient(new EvilEye(), 10));
        addRecipe(new Recipe(1000000, new PeachDjini().setGold(true))
                .addIngredient(new PeachDjini(), 10));
        addRecipe(new Recipe(1250000, new RecordThug())
                .addIngredient(new EmbarrassingBard())
                .addIngredient(new DarkPortal(), 3)
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(30, new HuskerWorm())
                .addIngredient(new Cornball())
                .addIngredient(new CerebralBloodstorm()));
        addRecipe(new Recipe(625, new SoftEyeling())
                .addIngredient(new Fluffapillar())
                .addIngredient(new HeavenlyGazer()));
        addRecipe(new Recipe(120, new CoolDog())
                .addIngredient(new GrapeSlimey())
                .addIngredient(new ThePig())
                .addIngredient(new WizardMigrane()));
        addRecipe(new Recipe(700, new MsMummy())
                .addIngredient(new GreenCactaball())
                .addIngredient(new Fluffapillar()));
        addRecipe(new Recipe(140, new TeethLeaf())
                .addIngredient(new GreenCactaball())
                .addIngredient(new Mouthball()));
        addRecipe(new Recipe(1000, new CerebralBloodstorm())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(300, new Volcano())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(400, new WoadBlood())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(525, new WizardMigrane())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(600, new StrawberryButt())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(675, new CrystalBall())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(900, new CornDome())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(5000, new BeachMum())
                .addIngredient(new MsMummy())
                .addIngredient(new GreenCactaball(), 2)
                .addIngredient(new TomeOfAnkhs()));
        addRecipe(new Recipe(1000, new FatGoat())
                .addIngredient(new ThePig())
                .addIngredient(new Fluffapillar(), 3)
                .addIngredient(new SuperHug()));
        addRecipe(new Recipe(2000, new FreezyJ())
                .addIngredient(new NiceIceBaby())
                .addIngredient(new ImprovedSugarImp(), 3)
                .addIngredient(new ScrollOfFreshBreath()));
        addRecipe(new Recipe(4000, new GreenSnakey())
                .addIngredient(new HuskerWorm())
                .addIngredient(new PsychicTempest())
                .addIngredient(new LimeSlimey(), 2));
        addRecipe(new Recipe(1000, new SnappyDresser())
                .addIngredient(new WanderingBaldMan())
                .addIngredient(new Fluffapillar(), 3)
                .addIngredient(new ScrollOfFreshBreath()));
        addRecipe(new Recipe(4000, new CornScepter())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(5600, new ScrollOfFreshBreath())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(4500, new BoneWand())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(6200, new TomeOfAnkhs())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(7800, new PumaClaw())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(8900, new SuperHug())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(10000, new FountainOfForgiveness())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(10000, new GhostNinja())
                .addIngredient(new WhiteNinja())
                .addIngredient(new FallingStar(), 4)
                .addIngredient(new ComfyCave()));
        addRecipe(new Recipe(30000, new DetectiveBobby())
                .addIngredient(new FreezyJ(), 5)
                .addIngredient(new ScrollOfFreshBreath())
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(10000, new FieldOfNightmares())
                .addIngredient(new WallOfEars())
                .addIngredient(new WoadBlood())
                .addIngredient(new BoneWand()));
        addRecipe(new Recipe(20000, new WitchWay())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(40000, new ClairvoyantDaggerstorm())
                .addIngredient(new CerebralBloodstorm())
                .addIngredient(new PsychicTempest())
                .addIngredient(new WizardMigrane()));
        addRecipe(new Recipe(50000, new HotDogRain())
                .addIngredient(new CerebralBloodstorm())
                .addIngredient(new PsychicTempest())
                .addIngredient(new ClairvoyantDaggerstorm()));
        addRecipe(new Recipe(70000, new BubblegumButt())
                .addIngredient(new GrapeButt())
                .addIngredient(new StrawberryButt())
                .addIngredient(new ImprovedSugarImp()));
        addRecipe(new Recipe(100, new ThePickler())
                .addIngredient(new GreenMerman())
                .addIngredient(new ScrollOfBadBreath())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(100, new DetectiveSally())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new ScrollOfBadBreath())
                .addIngredient(new ScrollOfFreshBreath())
                .addIngredient(new HotDogRain())
                .addIngredient(new HotDogRain()));
        addRecipe(new Recipe(100, new SnakeEyeRing())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new PortalToNowhere())
                .addIngredient(new DarkPortal())
                .addIngredient(new Teleport())
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(100, new UnemptyCoffin())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new PieStorm())
                .addIngredient(new HotDogRain())
                .addIngredient(new ImprovedSugarImp())
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(100, new CornParthenon())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new ZaZosMagicSeeds())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new UltimateMagicHands())
                .addIngredient(new BurningHand(), 2)
                .addIngredient(new DoorOfStrength(), 4)
                .addIngredient(new FallingStar(), 7));
        addRecipe(new Recipe(100, new ThroneOfDoom())
                .addIngredient(new ThroneOfGloom())
                .addIngredient(new PortalToNowhere())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(100, new BriefPower())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new DoorOfStrength())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new SchoolHouse())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(10000, new CornRonin())
                .addIngredient(new WhiteNinja(), 2)
                .addIngredient(new CornScepter(), 3)
                .addIngredient(new FieldOfNightmares()));
        addRecipe(new Recipe(30000, new DogBoy())
                .addIngredient(new CoolDog())
                .addIngredient(new SnappyDresser())
                .addIngredient(new DarkPortal(), 5));
        addRecipe(new Recipe(50000, new FutureScholar())
                .addIngredient(new AncientScholar())
                .addIngredient(new TomeOfAnkhs(), 5)
                .addIngredient(new SiloOfTruth()));
        addRecipe(new Recipe(100000, new MudAngel())
                .addIngredient(new MayonaiseAngel())
                .addIngredient(new WallOfSand(), 3)
                .addIngredient(new HotDogRain(), 3));
        addRecipe(new Recipe(40000, new PunkCat())
                .addIngredient(new CornDog())
                .addIngredient(new DarkPortal(), 2)
                .addIngredient(new WoadBlood(), 3));
        addRecipe(new Recipe(80000, new TreeOfUnderneath())
                .addIngredient(new SnuggleTree())
                .addIngredient(new ClairvoyantDaggerstorm(), 3)
                .addIngredient(new FieldOfNightmares(), 3));
        addRecipe(new Recipe(60000, new CoughSyrup())
                .addIngredient(new FountainOfForgiveness())
                .addIngredient(new MayonaiseAngel())
                .addIngredient(new ScrollOfFreshBreath()));
        addRecipe(new Recipe(20000, new SiloOfTruth())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new FieldStalker())
                .addIngredient(new TemporalWisp())
                .addIngredient(new FieldOfNightmares())
                .addIngredient(new DarkPortal()));
        addRecipe(new Recipe(100, new Phyllis())
                .addIngredient(new Earl())
                .addIngredient(new SnakeEyeRing())
                .addIngredient(new Sandwitch()));
        addRecipe(new Recipe(100, new SandKnight())
                .addIngredient(new HuskerKnight())
                .addIngredient(new WallOfSand())
                .addIngredient(new Sandwitch()));
        addRecipe(new Recipe(100, new SgtMushroom())
                .addIngredient(new SnuggleTree())
                .addIngredient(new TreeOfUnderneath())
                .addIngredient(new ThePig()));
        addRecipe(new Recipe(100, new StruzannJinn())
                .addIngredient(new IcePaladin())
                .addIngredient(new ClairvoyantDaggerstorm())
                .addIngredient(new FallingStar()));
        addRecipe(new Recipe(100, new WizardRawk())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new NicelandsTower())
                .addIngredient(new Teleport()));
        addRecipe(new Recipe(100, new CornLord())
                .addIngredient(new GoodKingWonderful())
                .addIngredient(new LegionOfEarlings())
                .addIngredient(new ThroneOfDoom()));
        addRecipe(new Recipe(100, new WoadicChief())
                .addIngredient(new WoadicMarauder(), 10)
                .addIngredient(new PsionicArchitect(), 10)
                .addIngredient(new WoadBlood(), 10));
        addRecipe(new Recipe(100, new MotherFluffBucket())
                .addIngredient(new SnuggleTree(), 10)
                .addIngredient(new SgtMushroom(), 3)
                .addIngredient(new SuperHug()));
        addRecipe(new Recipe(100, new Pieclops())
                .addIngredient(new PieStorm(), 7)
                .addIngredient(new StruzannJinn())
                .addIngredient(new MayonaiseAngel(), 10));
        addRecipe(new Recipe(100, new RainbowBarfer())
                .addIngredient(new ThePickler(), 5)
                .addIngredient(new PieStorm(), 5)
                .addIngredient(new BananaButt(), 5));
        addRecipe(new Recipe(100, new TheMariachi())
                .addIngredient(new EmbarrassingBard())
                .addIngredient(new WizardRawk(), 4)
                .addIngredient(new DarkPortal(), 5));
        addRecipe(new Recipe(100, new SkullJuice())
                .addIngredient(new CoughSyrup(), 5)
                .addIngredient(new HotDogRain(), 5)
                .addIngredient(new Sandwitch(), 3));
        addRecipe(new Recipe(100, new SpiritTower())
                .addIngredient(new NicelandsTower())
                .addIngredient(new SpiritTorch())
                .addIngredient(new FallingStar()));
    }
}

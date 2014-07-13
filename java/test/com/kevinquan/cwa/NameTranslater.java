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
package com.kevinquan.cwa;

import java.util.Hashtable;

import org.json.JSONObject;

import com.kevinquan.cwa.model.Card;
import com.kevinquan.cwa.model.Card.Faction;
import com.kevinquan.cwa.model.Card.Rarity;
import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.CaveOfSolitude;
import com.kevinquan.cwa.model.buildings.ComfyCave;
import com.kevinquan.cwa.model.buildings.CornCastle;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.buildings.CornParthenon;
import com.kevinquan.cwa.model.buildings.Mausoleum;
import com.kevinquan.cwa.model.buildings.NicelandsTower;
import com.kevinquan.cwa.model.buildings.ObelisxOfVengence;
import com.kevinquan.cwa.model.buildings.PalaceOfBone;
import com.kevinquan.cwa.model.buildings.PuffyCastle;
import com.kevinquan.cwa.model.buildings.Pyramidia;
import com.kevinquan.cwa.model.buildings.SandCastle;
import com.kevinquan.cwa.model.buildings.SandPyramid;
import com.kevinquan.cwa.model.buildings.SandSphinx;
import com.kevinquan.cwa.model.buildings.SchoolHouse;
import com.kevinquan.cwa.model.buildings.ShadowPyramid;
import com.kevinquan.cwa.model.buildings.SiloOfTruth;
import com.kevinquan.cwa.model.buildings.SpiritTower;
import com.kevinquan.cwa.model.buildings.Stonehenge;
import com.kevinquan.cwa.model.buildings.SunPyramid;
import com.kevinquan.cwa.model.buildings.WoadMobileHome;
import com.kevinquan.cwa.model.creatures.corn.ArcherDan;
import com.kevinquan.cwa.model.creatures.corn.CornDog;
import com.kevinquan.cwa.model.creatures.corn.Cornball;
import com.kevinquan.cwa.model.creatures.corn.EthanAllfire;
import com.kevinquan.cwa.model.creatures.corn.HuskerKnight;
import com.kevinquan.cwa.model.creatures.corn.HuskerWorm;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.WallOfEars;
import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.FatGoat;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.GoldAngelHeart;
import com.kevinquan.cwa.model.creatures.nice.GoldFatGoat;
import com.kevinquan.cwa.model.creatures.nice.NicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.nice.SnakeMint;
import com.kevinquan.cwa.model.creatures.nice.SnuggleTree;
import com.kevinquan.cwa.model.creatures.nice.SoftEyeling;
import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.GreenSnakey;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.PeachDjini;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.creatures.rainbow.WhiteNinja;
import com.kevinquan.cwa.model.creatures.sandy.BeachMum;
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
import com.kevinquan.cwa.model.creatures.swamp.Herculeye;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.WanderingBaldMan;
import com.kevinquan.cwa.model.hero.Hero;
import com.kevinquan.cwa.model.levels.Quest;
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
import com.kevinquan.cwa.model.spells.IncredibleEgg;
import com.kevinquan.cwa.model.spells.KungFuPower;
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
import com.kevinquan.cwa.model.spells.SubliminalStrength;
import com.kevinquan.cwa.model.spells.SuperHug;
import com.kevinquan.cwa.model.spells.TaxReduction;
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
import com.kevinquan.java.utils.JSONUtils;

public class NameTranslater {

    @SuppressWarnings("unused")
    private static final String TAG = NameTranslater.class.getSimpleName();

    private static class NameTranslaterHolder {
        private static final NameTranslater INSTANCE = new NameTranslater();
    }
    
    public static NameTranslater getInstance() {
        return NameTranslaterHolder.INSTANCE;
    }
    
    protected Hashtable<String, Quest> mQuestConditions;
    protected Hashtable<String, Hero> mHeroes;
    protected Hashtable<String, Card> mCards;
    
    private NameTranslater() {
        mQuestConditions = new Hashtable<String, Quest>();
        initQuests();
        mHeroes = new Hashtable<String, Hero>();
        initHeroes();
        mCards = new Hashtable<String, Card>();
        initCards();
    }
    
    protected void initCards() {
        mCards.put("Building_BlueCastle", new AstralFortress());
        mCards.put("Building_CaveOfSolitude", new CaveOfSolitude());
        mCards.put("Building_ComfyCave", new ComfyCave());
        mCards.put("Building_ElfTeePee", new WoadMobileHome());
        mCards.put("Building_NicelandsTower", new NicelandsTower());
        mCards.put("Building_Obelisx", new ObelisxOfVengence());
        mCards.put("Building_PalaceOfBone", new PalaceOfBone());
        mCards.put("Building_PuffyCastle", new PuffyCastle());
        mCards.put("Building_Pyramidia", new Pyramidia());
        mCards.put("Building_RedCastle", new CornCastle());
        mCards.put("Building_RedDome", new CornDome());
        mCards.put("Building_RedParthenon", new CornParthenon());
        mCards.put("Building_SandCastle", new SandCastle());
        mCards.put("Building_SandPyramid", new SandPyramid());
        mCards.put("Building_SchoolHouse", new SchoolHouse());
        mCards.put("Building_SiloOfTruth", new SiloOfTruth());
        mCards.put("Building_Sphinx", new SandSphinx());
        mCards.put("Building_SpiritTower", new SpiritTower());
        mCards.put("Building_Stonehenge", new Stonehenge());
        mCards.put("Building_ShadowPyramid", new ShadowPyramid());
        mCards.put("Building_Mausoleum", new Mausoleum());
        mCards.put("Building_SunPyramid", new SunPyramid());

        /*     
        mCards.put("", new );
        mCards.put("", new );
        mCards.put("", new );
        mCards.put("", new );
        */
        
        // Corn
        mCards.put("Creature_Cornball", new Cornball());
        mCards.put("Creature_BurningBush", new EthanAllfire());
        mCards.put("Creature_HuskerKnight", new HuskerKnight());
        mCards.put("Creature_CornWorm", new HuskerWorm());
        mCards.put("Creature_CareCrow", new TravelinFarmer());
        mCards.put("Creature_ArcherDan", new ArcherDan());
        mCards.put("Creature_CornDog", new CornDog());
        mCards.put("Creature_CornWall", new WallOfEars());
        
        // Plains
        mCards.put("Creature_AngelEye", new HeavenlyGazer());
        mCards.put("Creature_CoolDog", new CoolDog());
        mCards.put("Creature_GrapeSlimey", new GrapeSlimey());
        mCards.put("Creature_Poultrygeist", new Poultrygeist());
        mCards.put("Creature_ManowarElf", new WoadicTimeWalker());
        mCards.put("Creature_AncientScholar", new AncientScholar());
        mCards.put("Creature_Axey", new Axey());
        mCards.put("Creature_DragonClaw", new DragonClaw());
        
        // Nice
        mCards.put("Creature_AngelHeart", new AngelHeart());
        mCards.put("Creature_GL_AngelHeart", new GoldAngelHeart());
        mCards.put("Creature_BlueberryDjini", new BlueberryDjini());
        mCards.put("Creature_FairyShepard", new FairyShepard());
        mCards.put("Creature_Flufflapillar", new Fluffapillar());
        mCards.put("Creature_SoftEyeling", new SoftEyeling());
        mCards.put("Creature_FatGoat", new FatGoat());
        mCards.put("Creature_GL_FatGoat", new GoldFatGoat());
        mCards.put("Creature_CottonEyeBat", new NicelandsEyeBat());
        mCards.put("Creature_SnakeMint", new SnakeMint());
        mCards.put("Creature_SnuggleTree", new SnuggleTree());
        
        // Sandy
        mCards.put("Creature_SkeletalHand", new BurningHand());
        mCards.put("Creature_CactusBall", new GreenCactaball());
        mCards.put("Creature_MsMummy", new MsMummy());
        mCards.put("Creature_AngelOfSand", new SandAngel());
        mCards.put("Creature_BeachMum", new BeachMum());
        mCards.put("Creature_SandEyeBat", new SandEyebat());
        mCards.put("Creature_LimeSlimey", new LimeSlimey());
        mCards.put("Creature_AngelOfVanilla", new MayonaiseAngel());
        mCards.put("Creature_SandSnake", new SandSnake());
        
        // Swamp
        mCards.put("Creature_WanderingBaldMan", new WanderingBaldMan());
        mCards.put("Creature_GrayEyeBat", new GrayEyebat());
        mCards.put("Creature_OrangeSlimey", new OrangeSlimey());
        mCards.put("Creature_SpikedMaceStump", new MaceStump());
        mCards.put("Creature_TeethLeaf", new TeethLeaf());
        mCards.put("Creature_GreenMerman", new GreenMerman());
        mCards.put("Creature_Herculeye", new Herculeye());
        mCards.put("Creature_HotEyeBat", new HotEyebat());
        
        // Rainbow
        mCards.put("Creature_Mouthball", new Mouthball());
        mCards.put("Creature_SugarImp", new ImprovedSugarImp());
        mCards.put("Creature_Ninja", new OrdinaryNinja());
        mCards.put("Creature_IceIceBaby", new NiceIceBaby());
        mCards.put("Creature_Pig", new ThePig());
        mCards.put("Creature_TravelinSkeleton", new TravelinSkeleton());
        mCards.put("Creature_DevilEye", new EvilEye());
        mCards.put("Creature_GreenSnakey", new GreenSnakey());
        mCards.put("Creature_PeachDjini", new PeachDjini());
        mCards.put("Creature_WhiteNinja", new WhiteNinja());
        
        // Spells
        mCards.put("Spell_BananaButt", new BananaButt());
        mCards.put("Spell_BoneWand", new BoneWand());
        mCards.put("Spell_BriefPower", new BriefPower());
        mCards.put("Spell_BubblegumButt", new BubblegumButt());
        mCards.put("Spell_CerebralBloodstorm", new CerebralBloodstorm());
        mCards.put("Spell_ClairvoyantDaggerStorm", new ClairvoyantDaggerstorm());
        mCards.put("Spell_CornScepter", new CornScepter());
        mCards.put("Spell_CoughSyrup", new CoughSyrup());
        mCards.put("Spell_CrystalBall", new CrystalBall());
        mCards.put("Spell_DarkPortal", new DarkPortal());
        mCards.put("Spell_DoorOfStrength", new DoorOfStrength());
        mCards.put("Spell_ElfBlood", new WoadBlood());
        mCards.put("Spell_FallingStar", new FallingStar());
        mCards.put("Spell_FieldOfNightmares", new FieldOfNightmares());
        mCards.put("Spell_FountainOfForgiveness", new FountainOfForgiveness());
        mCards.put("Spell_GrapeButt", new GrapeButt());
        mCards.put("Spell_HotDogRain", new HotDogRain());
        mCards.put("Spell_Migraine", new WizardMigrane());
        mCards.put("Spell_PieStorm", new PieStorm());
        mCards.put("Spell_PortalToNowhere", new PortalToNowhere());
        mCards.put("Spell_PsychicTempest", new PsychicTempest());
        mCards.put("Spell_PumaClaw", new PumaClaw());
        mCards.put("Spell_ScrollOfBadBreath", new ScrollOfBadBreath());
        mCards.put("Spell_ScrollOfFreshBreath", new ScrollOfFreshBreath());
        mCards.put("Spell_SkullJuice", new SkullJuice());
        mCards.put("Spell_SnakeEyeRing", new SnakeEyeRing());
        mCards.put("Spell_SpiritTorch", new SpiritTorch());
        mCards.put("Spell_StrawberryButt", new StrawberryButt());
        mCards.put("Spell_SuperHug", new SuperHug());
        mCards.put("Spell_Teleport", new Teleport());
        mCards.put("Spell_ThroneOfDoom", new ThroneOfDoom());
        mCards.put("Spell_ThroneOfGloom", new ThroneOfGloom());
        mCards.put("Spell_TomeOfAnkhs", new TomeOfAnkhs());
        mCards.put("Spell_UFOabduction", new UfoAbduction());
        mCards.put("Spell_UltimateMagicHands", new UltimateMagicHands());
        mCards.put("Spell_UnemptyCoffin", new UnemptyCoffin());
        mCards.put("Spell_Volcano", new Volcano());
        mCards.put("Spell_WitchWay", new WitchWay());
        mCards.put("Spell_WizardRawk", new WizardRawk());
        mCards.put("Spell_ZazosMagicSeeds", new ZaZosMagicSeeds());
        mCards.put("Spell_TaxReduction", new TaxReduction());
        mCards.put("Spell_IncredibleEgg", new IncredibleEgg());
        mCards.put("Spell_KungFuPower", new KungFuPower());
        mCards.put("Spell_SubliminalStrength", new SubliminalStrength()); 
    }
    
    public int getCardCount(String prefix) {
        int count = 0;
        for (String key : mCards.keySet()) {
            if (key.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }
    
    public Card getCardByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        return mCards.get(name);
    }
    
    protected void initHeroes() {
        mHeroes.put("Jake", Hero.JAKE);
        mHeroes.put("Finn", Hero.FINN);
        mHeroes.put("BMO", Hero.BMO);
        mHeroes.put("Marceline", Hero.MARCELINE);
        mHeroes.put("PrincessBubblegum", Hero.PRINCESS_BUBBLEGUM);
        mHeroes.put("FlamePrincess", Hero.FLAME_PRINCESS);
        mHeroes.put("LadyRainicorn", Hero.LADY_RAINICORN);
        mHeroes.put("LumpySpacePrincess", Hero.LUMPY_SPACE_PRINCESS);
        mHeroes.put("Ash", Hero.ASH);
        mHeroes.put("RicardioHeartGuy", Hero.RICARDIO);
        mHeroes.put("DrDonut", Hero.DR_DONUT);
        
        mHeroes.put("EarlOfLemongrab", Hero.EARL_OF_LEMONGRAB);
        mHeroes.put("IceKing", Hero.ICE_KING);
        mHeroes.put("HunsonAbadeer", Hero.HUNSON_ABADEER);
        mHeroes.put("Gunter", Hero.GUNTER);
        mHeroes.put("FinnDoctor", Hero.FINN_DOCTOR);
        mHeroes.put("FinnPajama", Hero.FINN_PAJAMA);
        mHeroes.put("MagicMan", Hero.MAGIC_MAN);
        mHeroes.put("PeppermintButler", Hero.PEPPERMINT_BUTLER);
        mHeroes.put("CinamonBunn", Hero.CINAMON_BUNN);
        mHeroes.put("BananaGuard", Hero.BANANA_GUARD);
    }
    
    public Hero getHeroByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        return mHeroes.get(name);
    }
    
    protected void initQuests() {
        mQuestConditions.put("JustWin", Quest.DEFAULT_FIRST_QUEST);
        mQuestConditions.put("Forbid_Corn", Quest.CORN_FORBIDDEN);
        mQuestConditions.put("Forbid_Plains", Quest.PLAINS_FORBIDDEN);
        mQuestConditions.put("Forbid_Swamp", Quest.SWAMP_FORBIDDEN);
        mQuestConditions.put("Forbid_Cotton", Quest.NICE_FORBIDDEN);
        mQuestConditions.put("Forbid_Sand", Quest.SANDY_FORBIDDEN);
        mQuestConditions.put("Forbid_Universal", Quest.RAINBOW_FORBIDDEN);
        mQuestConditions.put("Only_Corn", Quest.CORN_ONLY);
        mQuestConditions.put("Only_Plains", Quest.PLAINS_ONLY);
        mQuestConditions.put("Only_Swamp", Quest.SWAMP_ONLY);
        mQuestConditions.put("Only_Cotton", Quest.NICE_ONLY);
        mQuestConditions.put("Only_Sand", Quest.SANDY_ONLY);
        mQuestConditions.put("Only_Universal", Quest.RAINBOW_ONLY);
        mQuestConditions.put("FastWin3", Quest.WIN_IN_3_TURNS);
        mQuestConditions.put("FastWin5", Quest.WIN_IN_5_TURNS);
        mQuestConditions.put("FastWin7", Quest.WIN_IN_7_TURNS);
        mQuestConditions.put("FastWin10", Quest.WIN_IN_10_TURNS);
        mQuestConditions.put("Forbid_Spells", Quest.NO_SPELLS);
        mQuestConditions.put("Forbid_Creatures", Quest.NO_CREATURES);
        mQuestConditions.put("Forbid_Buildings", Quest.NO_BUILDINGS);
        mQuestConditions.put("Only_Spells", Quest.ONLY_SPELLS);
        mQuestConditions.put("Only_Creatures", Quest.ONLY_CREATURES);
        mQuestConditions.put("Defeat2", Quest.DEFEAT_2_CREATURES);
        mQuestConditions.put("Defeat5", Quest.DEFEAT_5_CREATURES);
        // this is a typo in the blueprint
        mQuestConditions.put("Deafeat10", Quest.DEFEAT_10_CREATURES); 
        mQuestConditions.put("Defeat15", Quest.DEFEAT_15_CREATURES);
        mQuestConditions.put("Defeat20", Quest.DEFEAT_20_CREATURES);
        mQuestConditions.put("Defeat25", Quest.DEFEAT_25_CREATURES);
        mQuestConditions.put("Only0PointCards", Quest.ONLY_0_POINT_CARDS);
        mQuestConditions.put("Only1PointCards", Quest.ONLY_1_POINT_CARDS);
        mQuestConditions.put("Only2PointCards", Quest.ONLY_2_POINT_CARDS);
        mQuestConditions.put("Only3PointCards", Quest.ONLY_3_POINT_CARDS);
        mQuestConditions.put("Only10Points", Quest.ONLY_10_POINTS);
        mQuestConditions.put("Only15Points", Quest.ONLY_15_POINTS);
        mQuestConditions.put("Only20Points", Quest.ONLY_20_POINTS);
        mQuestConditions.put("Only25Points", Quest.ONLY_25_POINTS);
        mQuestConditions.put("Only5HP", Quest.LOSE_5HP_MAX);
        mQuestConditions.put("Only10HP", Quest.LOSE_10HP_MAX);
        mQuestConditions.put("Only25HP", Quest.LOSE_25HP_MAX);
        mQuestConditions.put("Only50HP", Quest.LOSE_50HP_MAX);
        mQuestConditions.put("Only100HP", Quest.LOSE_100HP_MAX);
        mQuestConditions.put("OnlyLose2Creatures", Quest.LOSE_2_CREATURES_MAX);
        mQuestConditions.put("OnlyLose3Creatures", Quest.LOSE_3_CREATURES_MAX);
        mQuestConditions.put("OnlyLose5Creatures", Quest.LOSE_5_CREATURES_MAX);
        mQuestConditions.put("OnlyLose10Creatures", Quest.LOSE_10_CREATURES_MAX);
        mQuestConditions.put("Landscapes_Four", Quest.LANDSCAPES_FOUR_DIFFERENT);
        mQuestConditions.put("Landscapes_Three", Quest.LANDSCAPES_THREE_DIFFERENT);
        mQuestConditions.put("Landscapes_Two", Quest.LANDSCAPES_TWO_DIFFERENT);
        mQuestConditions.put("MaxCost30", Quest.COST_30_MAX);
    }
    
    public Quest getQuestByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        return mQuestConditions.get(name);
    }
    
    public int getQuestCount() {
        return mQuestConditions.values().size();
    }
    
    public static Rarity getRarity(JSONObject object) {
        if (object == null) {
            return null;
        }
        switch (JSONUtils.safeGetInt(object, Blueprints.FIELD_RARITY, 0)) {
            case 1: return Rarity.Cool;
            case 2: return Rarity.Nice;
            case 3: return Rarity.Rare;
            case 4: return Rarity.VeryRare;
            case 5: return Rarity.AlgebraicRare;
            default: return null;
        }
    }
    
    public static Faction getFaction(JSONObject object) {
        if (object == null) {
            return null;
        }
        String faction = JSONUtils.safeGetString(object, Blueprints.FIELD_FACTION);
        if ("Universal".equalsIgnoreCase(faction)) {
            return Faction.Rainbow;
        }
        // TODO: Add other factions
        return null;
    }
    
    public static String getArea(JSONObject object) {
        if (object == null) {
            return null;
        }
        String blueprintArea = JSONUtils.safeGetString(object, "LevelName");
        if ("!!LEVEL_TREEHOUSE".equalsIgnoreCase(blueprintArea)) {
            return "Area.Treehouse";
        } else if ("!!LEVEL_PICNIC".equalsIgnoreCase(blueprintArea)) {
            return "Area.Forest";
        } else if ("!!LEVEL_CANDY".equalsIgnoreCase(blueprintArea)) {
            return "Area.CandyKingdom";
        } else if ("!!LEVEL_BEACH".equalsIgnoreCase(blueprintArea)) {
            return "Area.Beach";
        } else if ("!!LEVEL_CAVE".equalsIgnoreCase(blueprintArea)) {
            return "Area.MarcelineCave";
        } else if ("!!LEVEL_ICE".equalsIgnoreCase(blueprintArea)) {
            return "Area.IceKingdom";
        } else if ("!!LEVEL_SAND".equalsIgnoreCase(blueprintArea)) {
            return "Area.Desert";
        } else if ("!!LEVEL_DARKFOREST".equalsIgnoreCase(blueprintArea)) {
            return "Area.DarkForest";
        }
        return null;
    }
    
    public static String getOpponent(JSONObject object) {
        if (object == null) {
            return null;
        }
        String opponent = JSONUtils.safeGetString(object, Blueprints.FIELD_OPPONENT);
        if ("Finn".equalsIgnoreCase(opponent)) {
            return "Hero.FINN";
        } else if ("BMO".equalsIgnoreCase(opponent)) {
            return "Hero.BMO";
        } else if ("Marceline".equalsIgnoreCase(opponent)) {
            return "Hero.MARCELINE";
        } else if ("PrincessBubblegum".equalsIgnoreCase(opponent)) {
            return "Hero.PRINCESS_BUBBLEGUM";
        } else if ("FlamePrincess".equalsIgnoreCase(opponent)) {
            return "Hero.FLAME_PRINCESS";
        } else if ("LadyRainicorn".equalsIgnoreCase(opponent)) {
            return "Hero.LADY_RAINICORN";
        } else if ("LumpySpacePrincess".equalsIgnoreCase(opponent)) {
            return "Hero.LUMPY_SPACE_PRINCESS";
        } else if ("Ash".equalsIgnoreCase(opponent)) {
            return "Hero.ASH";
        } else if ("RicardioHeartGuy".equalsIgnoreCase(opponent)) {
            return "Hero.RICARDIO";
        } else if ("DrDonut".equalsIgnoreCase(opponent)) {
            return "Hero.DR_DONUT";
        } else if ("EarlOfLemongrab".equalsIgnoreCase(opponent)) {
            return "Hero.EARL_OF_LEMONGRAB";
        } else if ("HunsonAbadeer".equalsIgnoreCase(opponent)) {
            return "Hero.HUNSON_ABADEER";
        } else if ("Jake".equalsIgnoreCase(opponent)) {
            return "Hero.JAKE";
        } else if ("Gunter".equalsIgnoreCase(opponent)) {
            return "Hero.GUNTER";
        } else if ("IceKing".equalsIgnoreCase(opponent)) {
            return "Hero.ICE_KING";
        } else if ("FinnDoctor".equalsIgnoreCase(opponent)) {
            return "Hero.FINN_DOCTOR";
        } else if ("MagicMan".equalsIgnoreCase(opponent)) {
            return "Hero.MAGIC_MAN";
        } else if ("FinnPajama".equalsIgnoreCase(opponent)) {
            return "Hero.FINN_PAJAMA";
        } else if ("PeppermintButler".equalsIgnoreCase(opponent)) {
            return "Hero.PEPPERMINT_BUTLER";
        }
        // No Cinamon Bunn or Banana Guard
        return null;
    }
    
    public static String getQuest(JSONObject object, String questKey) {
        if (object == null) {
            return null;
        }
        String condition = JSONUtils.safeGetString(object, questKey);
        if ("JustWin".equalsIgnoreCase(condition)) {
            return "Quest.DEFAULT_FIRST_QUEST";
        } else if ("Forbid_Corn".equalsIgnoreCase(condition)) {
            return "Quest.CORN_FORBIDDEN";
        } else if ("Forbid_Plains".equalsIgnoreCase(condition)) {
            return "Quest.PLAINS_FORBIDDEN";
        } else if ("Forbid_Swamp".equalsIgnoreCase(condition)) {
            return "Quest.SWAMP_FORBIDDEN";
        } else if ("Forbid_Cotton".equalsIgnoreCase(condition)) {
            return "Quest.NICE_FORBIDDEN";
        } else if ("Forbid_Sand".equalsIgnoreCase(condition)) {
            return "Quest.SANDY_FORBIDDEN";
        } else if ("Forbid_Universal".equalsIgnoreCase(condition)) {
            return "Quest.RAINBOW_FORBIDDEN";
        } else if ("Only_Corn".equalsIgnoreCase(condition)) {
            return "Quest.CORN_ONLY";
        } else if ("Only_Plains".equalsIgnoreCase(condition)) {
            return "Quest.PLAINS_ONLY";
        } else if ("Only_Swamp".equalsIgnoreCase(condition)) {
            return "Quest.SWAMP_ONLY";
        } else if ("Only_Cotton".equalsIgnoreCase(condition)) {
            return "Quest.NICE_ONLY";
        } else if ("Only_Sand".equalsIgnoreCase(condition)) {
            return "Quest.SANDY_ONLY";
        } else if ("Only_Universal".equalsIgnoreCase(condition)) {
            return "Quest.RAINBOW_ONLY";
        } else if ("FastWin3".equalsIgnoreCase(condition)) {
            return "Quest.WIN_IN_3_TURNS";
        } else if ("FastWin5".equalsIgnoreCase(condition)) {
            return "Quest.WIN_IN_5_TURNS";
        } else if ("FastWin7".equalsIgnoreCase(condition)) {
            return "Quest.WIN_IN_7_TURNS";
        } else if ("FastWin10".equalsIgnoreCase(condition)) {
            return "Quest.WIN_IN_10_TURNS";
        } else if ("Forbid_Spells".equalsIgnoreCase(condition)) {
            return "Quest.NO_SPELLS";
        } else if ("Forbid_Creatures".equalsIgnoreCase(condition)) {
            return "Quest.NO_CREATURES";
        } else if ("Forbid_Buildings".equalsIgnoreCase(condition)) {
            return "Quest.NO_BUILDINGS";
        } else if ("Only_Spells".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_SPELLS";
        } else if ("Only_Creatures".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_CREATURES";
        } else if ("Defeat2".equalsIgnoreCase(condition)) {
            return "Quest.DEFEAT_2_CREATURES";
        } else if ("Defeat5".equalsIgnoreCase(condition)) {
            return "Quest.DEFEAT_5_CREATURES";
        // this is a typo in the blueprint
        } else if ("Deafeat10".equalsIgnoreCase(condition)) {
            return "Quest.DEFEAT_10_CREATURES"; 
        } else if ("Defeat15".equalsIgnoreCase(condition)) {
            return "Quest.DEFEAT_15_CREATURES";
        } else if ("Defeat20".equalsIgnoreCase(condition)) {
            return "Quest.DEFEAT_20_CREATURES";
        } else if ("Defeat25".equalsIgnoreCase(condition)) { 
            return "Quest.DEFEAT_25_CREATURES";
        } else if ("Only0PointCards".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_0_POINT_CARDS";
        } else if ("Only1PointCards".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_1_POINT_CARDS";
        } else if ("Only2PointCards".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_2_POINT_CARDS";
        } else if ("Only3PointCards".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_3_POINT_CARDS";
        } else if ("Only10Points".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_10_POINTS";
        } else if ("Only15Points".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_15_POINTS";
        } else if ("Only20Points".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_20_POINTS";
        } else if ("Only25Points".equalsIgnoreCase(condition)) {
            return "Quest.ONLY_25_POINTS";
        } else if ("Only5HP".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_5HP_MAX";
        } else if ("Only10HP".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_10HP_MAX";
        } else if ("Only25HP".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_25HP_MAX";
        } else if ("Only50HP".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_50HP_MAX";
        } else if ("Only100HP".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_100HP_MAX";
        } else if ("OnlyLose2Creatures".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_2_CREATURES_MAX";
        } else if ("OnlyLose3Creatures".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_3_CREATURES_MAX";
        } else if ("OnlyLose5Creatures".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_5_CREATURES_MAX";
        } else if ("OnlyLose10Creatures".equalsIgnoreCase(condition)) {
            return "Quest.LOSE_10_CREATURES_MAX";
        } else if ("Landscapes_Four".equalsIgnoreCase(condition)) {
            return "Quest.LANDSCAPES_FOUR_DIFFERENT";
        } else if ("Landscapes_Three".equalsIgnoreCase(condition)) {
            return "Quest.LANDSCAPES_THREE_DIFFERENT";
        } else if ("Landscapes_Two".equalsIgnoreCase(condition)) {
            return "Quest.LANDSCAPES_TWO_DIFFERENT";
        } else if ("MaxCost30".equalsIgnoreCase(condition)) {
            return "Quest.COST_30_MAX";
        }
        return null;
    }
}

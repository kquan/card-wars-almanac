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
import com.kevinquan.cwa.model.creatures.corn.CaptainTaco;
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
import com.kevinquan.cwa.model.creatures.corn.LogKnight;
import com.kevinquan.cwa.model.creatures.corn.PatchyThePumpkin;
import com.kevinquan.cwa.model.creatures.corn.SunKing;
import com.kevinquan.cwa.model.creatures.corn.TheSludger;
import com.kevinquan.cwa.model.creatures.corn.TravelinFarmer;
import com.kevinquan.cwa.model.creatures.corn.WallOfEars;
import com.kevinquan.cwa.model.creatures.corn.YellowGnome;
import com.kevinquan.cwa.model.creatures.corn.MaryAnn;
import com.kevinquan.cwa.model.creatures.nice.AngelHeart;
import com.kevinquan.cwa.model.creatures.nice.AppleTree;
import com.kevinquan.cwa.model.creatures.nice.BlueberryDjini;
import com.kevinquan.cwa.model.creatures.nice.CottonsaurusRex;
import com.kevinquan.cwa.model.creatures.nice.DetectiveBobby;
import com.kevinquan.cwa.model.creatures.nice.DogBoy;
import com.kevinquan.cwa.model.creatures.nice.FairyShepard;
import com.kevinquan.cwa.model.creatures.nice.FarmerTom;
import com.kevinquan.cwa.model.creatures.nice.FatGoat;
import com.kevinquan.cwa.model.creatures.nice.Fatapillar;
import com.kevinquan.cwa.model.creatures.nice.Fluffantry;
import com.kevinquan.cwa.model.creatures.nice.Fluffapillar;
import com.kevinquan.cwa.model.creatures.nice.GoodKingWonderful;
import com.kevinquan.cwa.model.creatures.nice.MotherFluffBucket;
import com.kevinquan.cwa.model.creatures.nice.NicelandsCutie;
import com.kevinquan.cwa.model.creatures.nice.NicelandsEyeBat;
import com.kevinquan.cwa.model.creatures.nice.SackOPain;
import com.kevinquan.cwa.model.creatures.nice.SgtMushroom;
import com.kevinquan.cwa.model.creatures.nice.SnakeMint;
import com.kevinquan.cwa.model.creatures.nice.SnuggleTree;
import com.kevinquan.cwa.model.creatures.nice.SoftEyeling;
import com.kevinquan.cwa.model.creatures.nice.TheCow;
import com.kevinquan.cwa.model.creatures.nice.TravelinWizard;
import com.kevinquan.cwa.model.creatures.nice.WellDressedWolf;
import com.kevinquan.cwa.model.creatures.plains.AncientScholar;
import com.kevinquan.cwa.model.creatures.plains.Axey;
import com.kevinquan.cwa.model.creatures.plains.CameraDude;
import com.kevinquan.cwa.model.creatures.plains.CoolDog;
import com.kevinquan.cwa.model.creatures.plains.DiamondDan;
import com.kevinquan.cwa.model.creatures.plains.DragonClaw;
import com.kevinquan.cwa.model.creatures.plains.DragonFoot;
import com.kevinquan.cwa.model.creatures.plains.EmbarrassingBard;
import com.kevinquan.cwa.model.creatures.plains.GhostHag;
import com.kevinquan.cwa.model.creatures.plains.GrapeSlimey;
import com.kevinquan.cwa.model.creatures.plains.HeavenlyGazer;
import com.kevinquan.cwa.model.creatures.plains.Heifergeist;
import com.kevinquan.cwa.model.creatures.plains.InfiniteFigure;
import com.kevinquan.cwa.model.creatures.plains.Poultrygeist;
import com.kevinquan.cwa.model.creatures.plains.PsionicArchitect;
import com.kevinquan.cwa.model.creatures.plains.PunkCat;
import com.kevinquan.cwa.model.creatures.plains.StruzannJinn;
import com.kevinquan.cwa.model.creatures.plains.TemporalWisp;
import com.kevinquan.cwa.model.creatures.plains.TimmyMagicEyes;
import com.kevinquan.cwa.model.creatures.plains.WoadicChief;
import com.kevinquan.cwa.model.creatures.plains.WoadicMarauder;
import com.kevinquan.cwa.model.creatures.plains.WoadicTimeWalker;
import com.kevinquan.cwa.model.creatures.plains.XLargeSpiritSoldier;
import com.kevinquan.cwa.model.creatures.rainbow.BigFoot;
import com.kevinquan.cwa.model.creatures.rainbow.BrainGooey;
import com.kevinquan.cwa.model.creatures.rainbow.DetectiveSally;
import com.kevinquan.cwa.model.creatures.rainbow.DroolingDude;
import com.kevinquan.cwa.model.creatures.rainbow.Earl;
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.FisherFish;
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
import com.kevinquan.cwa.model.creatures.sandy.CactusThug;
import com.kevinquan.cwa.model.creatures.sandy.Fummy;
import com.kevinquan.cwa.model.creatures.sandy.GreenCactaball;
import com.kevinquan.cwa.model.creatures.sandy.GreenPartyOgre;
import com.kevinquan.cwa.model.creatures.sandy.LadyMary;
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
import com.kevinquan.cwa.model.creatures.sandy.SandasaurusRex;
import com.kevinquan.cwa.model.creatures.sandy.Sandfoot;
import com.kevinquan.cwa.model.creatures.sandy.Sandwitch;
import com.kevinquan.cwa.model.creatures.sandy.Sandy;
import com.kevinquan.cwa.model.creatures.sandy.WallOfSand;
import com.kevinquan.cwa.model.creatures.swamp.BaldMansThrone;
import com.kevinquan.cwa.model.creatures.swamp.ChestBuster;
import com.kevinquan.cwa.model.creatures.swamp.DarkAngel;
import com.kevinquan.cwa.model.creatures.swamp.DaveyBear;
import com.kevinquan.cwa.model.creatures.swamp.DrDeath;
import com.kevinquan.cwa.model.creatures.swamp.EyeGuy;
import com.kevinquan.cwa.model.creatures.swamp.GrayEyebat;
import com.kevinquan.cwa.model.creatures.swamp.GreenMermaid;
import com.kevinquan.cwa.model.creatures.swamp.GreenMerman;
import com.kevinquan.cwa.model.creatures.swamp.Herculeye;
import com.kevinquan.cwa.model.creatures.swamp.HotEyebat;
import com.kevinquan.cwa.model.creatures.swamp.ImmortalMaizeWalker;
import com.kevinquan.cwa.model.creatures.swamp.MaceStump;
import com.kevinquan.cwa.model.creatures.swamp.MamaSpider;
import com.kevinquan.cwa.model.creatures.swamp.MarkyMark;
import com.kevinquan.cwa.model.creatures.swamp.OrangeSlimey;
import com.kevinquan.cwa.model.creatures.swamp.RainbowBarfer;
import com.kevinquan.cwa.model.creatures.swamp.RecordThug;
import com.kevinquan.cwa.model.creatures.swamp.RedEyeling;
import com.kevinquan.cwa.model.creatures.swamp.SnappyDresser;
import com.kevinquan.cwa.model.creatures.swamp.SteakChop;
import com.kevinquan.cwa.model.creatures.swamp.TeethLeaf;
import com.kevinquan.cwa.model.creatures.swamp.TreeOfUnderneath;
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

        mCards.put("Creature_AncientScholar", new AncientScholar());
        mCards.put("Creature_AngelEye", new HeavenlyGazer());
        mCards.put("Creature_AngelHeart", new AngelHeart());
        mCards.put("Creature_AngelOfSand", new SandAngel());
        mCards.put("Creature_AngelOfVanilla", new MayonaiseAngel());
        mCards.put("Creature_ArcherDan", new ArcherDan());
        mCards.put("Creature_Axey", new Axey());
        mCards.put("Creature_BeachMum", new BeachMum());
        mCards.put("Creature_BlueberryDjini", new BlueberryDjini());
        mCards.put("Creature_BurningBush", new EthanAllfire());
        mCards.put("Creature_CactusBall", new GreenCactaball());
        mCards.put("Creature_CactusThug", new CactusThug());
        mCards.put("Creature_CaptainTaco", new CaptainTaco());
        mCards.put("Creature_CareCrow", new TravelinFarmer());
        mCards.put("Creature_ChestBurster", new ChestBuster());
        mCards.put("Creature_CoolDog", new CoolDog());
        mCards.put("Creature_Cornataur", new Cornataur());
        mCards.put("Creature_Cornball", new Cornball());
        mCards.put("Creature_CornDog", new CornDog());
        mCards.put("Creature_CornEyeBat", new Huskerbat());
        mCards.put("Creature_CornLord", new CornLord());
        mCards.put("Creature_CornRonin", new CornRonin());
        mCards.put("Creature_CornWall", new WallOfEars());
        mCards.put("Creature_CornWorm", new HuskerWorm());
        mCards.put("Creature_CottonEyeBat", new NicelandsEyeBat());
        mCards.put("Creature_CottonsaurusRex", new CottonsaurusRex());
        mCards.put("Creature_Cow", new TheCow());
        mCards.put("Creature_CowGhost", new Heifergeist());
        mCards.put("Creature_DarkAngel", new DarkAngel());
        mCards.put("Creature_DevilEye", new EvilEye());
        mCards.put("Creature_DiamondDan", new DiamondDan());
        mCards.put("Creature_DogBoy", new DogBoy());
        mCards.put("Creature_DragonClaw", new DragonClaw());
        mCards.put("Creature_DragonFoot", new DragonFoot());
        mCards.put("Creature_DrDeath", new DrDeath());
        mCards.put("Creature_Earl", new Earl());
        mCards.put("Creature_ElfChief", new WoadicChief());
        mCards.put("Creature_ElfMarauder", new WoadicMarauder());
        mCards.put("Creature_EmbarrassingBard", new EmbarrassingBard());
        mCards.put("Creature_ExtraordinarySpider", new MamaSpider());
        mCards.put("Creature_FairyShepard", new FairyShepard());
        mCards.put("Creature_FarmerTom", new FarmerTom());
        mCards.put("Creature_FatGoat", new FatGoat());
        mCards.put("Creature_FieldReaper", new FieldReaper());
        mCards.put("Creature_Fluffantry", new Fluffantry());
        mCards.put("Creature_Flufflapillar", new Fluffapillar());
        mCards.put("Creature_FreezyJ", new FreezyJ());
        mCards.put("Creature_Fummy", new Fummy());
        mCards.put("Creature_FutureScholar", new FutureScholar());
        mCards.put("Creature_Ghost", new TemporalWisp());
        mCards.put("Creature_GhostHag", new GhostHag());
        mCards.put("Creature_GhostNinja", new GhostNinja());
        mCards.put("Creature_GhostStalker", new FieldStalker());
        mCards.put("Creature_GiantFoot", new BigFoot());
        mCards.put("Creature_GL_AncientScholar", new AncientScholar().setGold(true));
        mCards.put("Creature_GL_AngelEye", new HeavenlyGazer().setGold(true));
        mCards.put("Creature_GL_AngelHeart", new AngelHeart().setGold(true));
        mCards.put("Creature_GL_AngelOfSand", new SandAngel().setGold(true));
        mCards.put("Creature_GL_AngelOfVanilla", new MayonaiseAngel().setGold(true));
        mCards.put("Creature_GL_ArcherDan", new ArcherDan().setGold(true));
        mCards.put("Creature_GL_Axey", new Axey().setGold(true));
        mCards.put("Creature_GL_BeachMum", new BeachMum().setGold(true));
        mCards.put("Creature_GL_BlueberryDjini", new BlueberryDjini().setGold(true));
        mCards.put("Creature_GL_BurningBush", new EthanAllfire().setGold(true));
        mCards.put("Creature_GL_CactusBall", new GreenCactaball().setGold(true));
        mCards.put("Creature_GL_CactusThug", new CactusThug().setGold(true));
        mCards.put("Creature_GL_CaptainTaco", new CaptainTaco().setGold(true));
        mCards.put("Creature_GL_CareCrow", new TravelinFarmer().setGold(true));
        mCards.put("Creature_GL_ChestBurster", new ChestBuster().setGold(true));
        mCards.put("Creature_GL_CoolDog", new CoolDog().setGold(true));
        mCards.put("Creature_GL_Cornataur", new Cornataur().setGold(true));
        mCards.put("Creature_GL_Cornball", new Cornball().setGold(true));
        mCards.put("Creature_GL_CornDog", new CornDog().setGold(true));
        mCards.put("Creature_GL_CornEyeBat", new Huskerbat().setGold(true));
        mCards.put("Creature_GL_CornLord", new CornLord().setGold(true));
        mCards.put("Creature_GL_CornRonin", new CornRonin().setGold(true));
        mCards.put("Creature_GL_CornWall", new WallOfEars().setGold(true));
        mCards.put("Creature_GL_CornWorm", new HuskerWorm().setGold(true));
        mCards.put("Creature_GL_CottonEyeBat", new NicelandsEyeBat().setGold(true));
        mCards.put("Creature_GL_CottonsaurusRex", new CottonsaurusRex().setGold(true));
        mCards.put("Creature_GL_Cow", new TheCow().setGold(true));
        mCards.put("Creature_GL_CowGhost", new Heifergeist().setGold(true));
        mCards.put("Creature_GL_DarkAngel", new DarkAngel().setGold(true));
        mCards.put("Creature_GL_DevilEye", new EvilEye().setGold(true));
        mCards.put("Creature_GL_DiamondDan", new DiamondDan().setGold(true));
        mCards.put("Creature_GL_DogBoy", new DogBoy().setGold(true));
        mCards.put("Creature_GL_DragonClaw", new DragonClaw().setGold(true));
        mCards.put("Creature_GL_DragonFoot", new DragonFoot().setGold(true));
        mCards.put("Creature_GL_DrDeath", new DrDeath().setGold(true));
        mCards.put("Creature_GL_Earl", new Earl().setGold(true));
        mCards.put("Creature_GL_ElfChief", new WoadicChief().setGold(true));
        mCards.put("Creature_GL_ElfMarauder", new WoadicMarauder().setGold(true));
        mCards.put("Creature_GL_EmbarrassingBard", new EmbarrassingBard().setGold(true));
        mCards.put("Creature_GL_ExtraordinarySpider", new MamaSpider().setGold(true));
        mCards.put("Creature_GL_FairyShepard", new FairyShepard().setGold(true));
        mCards.put("Creature_GL_FarmerTom", new FarmerTom().setGold(true));
        mCards.put("Creature_GL_FatGoat", new FatGoat().setGold(true));
        mCards.put("Creature_GL_FieldReaper", new FieldReaper().setGold(true));
        mCards.put("Creature_GL_Fluffantry", new Fluffantry().setGold(true));
        mCards.put("Creature_GL_Flufflapillar", new Fluffapillar().setGold(true));
        mCards.put("Creature_GL_FreezyJ", new FreezyJ().setGold(true));
        mCards.put("Creature_GL_Fummy", new Fummy().setGold(true));
        mCards.put("Creature_GL_FutureScholar", new FutureScholar().setGold(true));
        mCards.put("Creature_GL_Ghost", new TemporalWisp().setGold(true));
        mCards.put("Creature_GL_GhostHag", new GhostHag().setGold(true));
        mCards.put("Creature_GL_GhostNinja", new GhostNinja().setGold(true));
        mCards.put("Creature_GL_GhostStalker", new FieldStalker().setGold(true));
        mCards.put("Creature_GL_GiantFoot", new BigFoot().setGold(true));
        mCards.put("Creature_GL_GrapeSlimey", new GrapeSlimey().setGold(true));
        mCards.put("Creature_GL_GrayEyeBat", new GrayEyebat().setGold(true));
        mCards.put("Creature_GL_GreenMermaid", new GreenMermaid().setGold(true));
        mCards.put("Creature_GL_GreenMerman", new GreenMerman().setGold(true));
        mCards.put("Creature_GL_GreenSnakey", new GreenSnakey().setGold(true));
        mCards.put("Creature_GL_Herculeye", new Herculeye().setGold(true));
        mCards.put("Creature_GL_HotEyeBat", new HotEyebat().setGold(true));
        mCards.put("Creature_GL_HuskerGiant", new HuskerGiant().setGold(true));
        mCards.put("Creature_GL_HuskerKnight", new HuskerKnight().setGold(true));
        mCards.put("Creature_GL_IceIceBaby", new NiceIceBaby().setGold(true));
        mCards.put("Creature_GL_IceKnight", new IcePaladin().setGold(true));
        mCards.put("Creature_GL_KingFluff", new GoodKingWonderful().setGold(true));
        mCards.put("Creature_GL_KnightOfObesity", new XLargeSpiritSoldier().setGold(true));
        mCards.put("Creature_GL_LadyScarab", new LadyMary().setGold(true));
        mCards.put("Creature_GL_LegionOfEarlings", new LegionOfEarlings().setGold(true));
        mCards.put("Creature_GL_LimeSlimey", new LimeSlimey().setGold(true));
        mCards.put("Creature_GL_LostGolem", new LostGolem().setGold(true));
        mCards.put("Creature_GL_MaizeWalker", new ImmortalMaizeWalker().setGold(true));
        mCards.put("Creature_GL_ManowarElf", new WoadicTimeWalker().setGold(true));
        mCards.put("Creature_GL_MermaidYellow", new MaryAnn().setGold(true));
        mCards.put("Creature_GL_MotherFluffBucket", new MotherFluffBucket().setGold(true));
        mCards.put("Creature_GL_Mouthball", new Mouthball().setGold(true));
        mCards.put("Creature_GL_MsMummy", new MsMummy().setGold(true));
        mCards.put("Creature_GL_MudAngel", new MudAngel().setGold(true));
        mCards.put("Creature_GL_Ninja", new OrdinaryNinja().setGold(true));
        mCards.put("Creature_GL_OrangeSlimey", new OrangeSlimey().setGold(true));
        mCards.put("Creature_GL_PatchyThePumpkin", new PatchyThePumpkin().setGold(true));
        mCards.put("Creature_GL_PeachDjini", new PeachDjini().setGold(true));
        mCards.put("Creature_GL_Pentacutie", new DetectiveBobby().setGold(true));
        mCards.put("Creature_GL_Phyllis", new Phyllis().setGold(true));
        mCards.put("Creature_GL_Pickler", new ThePickler().setGold(true));
        mCards.put("Creature_GL_Pieclops", new Pieclops().setGold(true));
        mCards.put("Creature_GL_Pig", new ThePig().setGold(true));
        mCards.put("Creature_GL_PirateBear", new DaveyBear().setGold(true));
        mCards.put("Creature_GL_PorcelainGuardian", new PorcelainGuardian().setGold(true));
        mCards.put("Creature_GL_Poultrygeist", new Poultrygeist().setGold(true));
        mCards.put("Creature_GL_PunkCat", new PunkCat().setGold(true));
        mCards.put("Creature_GL_Quadurai", new Quadurai().setGold(true));
        mCards.put("Creature_GL_RainbowBarfer", new RainbowBarfer().setGold(true));
        mCards.put("Creature_GL_RecordThug", new RecordThug().setGold(true));
        mCards.put("Creature_GL_RedEyeling", new RedEyeling().setGold(true));
        mCards.put("Creature_GL_Rocktopus", new DetectiveSally().setGold(true));
        mCards.put("Creature_GL_SackOfPain", new SackOPain().setGold(true));
        mCards.put("Creature_GL_SandEyeBat", new SandEyebat().setGold(true));
        mCards.put("Creature_GL_SandFoot", new Sandfoot().setGold(true));
        mCards.put("Creature_GL_SandJackal", new SandJackal().setGold(true));
        mCards.put("Creature_GL_SandKnight", new SandKnight().setGold(true));
        mCards.put("Creature_GL_SandShark", new Sandy().setGold(true));
        mCards.put("Creature_GL_SandSnake", new SandSnake().setGold(true));
        mCards.put("Creature_GL_Sandwitch", new Sandwitch().setGold(true));
        mCards.put("Creature_GL_SgtMushroom", new SgtMushroom().setGold(true));
        mCards.put("Creature_GL_SkeletalHand", new BurningHand().setGold(true));
        mCards.put("Creature_GL_Sludger", new TheSludger().setGold(true));
        mCards.put("Creature_GL_SnakeMint", new SnakeMint().setGold(true));
        mCards.put("Creature_GL_SnappyDresser", new SnappyDresser().setGold(true));
        mCards.put("Creature_GL_SnuggleTree", new SnuggleTree().setGold(true));
        mCards.put("Creature_GL_SoftEyeling", new SoftEyeling().setGold(true));
        mCards.put("Creature_GL_SpikedMaceStump", new MaceStump().setGold(true));
        mCards.put("Creature_GL_SteakChop", new SteakChop().setGold(true));
        mCards.put("Creature_GL_StruzanJinn", new StruzannJinn().setGold(true));
        mCards.put("Creature_GL_SugarImp", new ImprovedSugarImp().setGold(true));
        mCards.put("Creature_GL_TeethLeaf", new TeethLeaf().setGold(true));
        mCards.put("Creature_GL_TheDrooler", new DroolingDude().setGold(true));
        mCards.put("Creature_GL_TheMariachi", new TheMariachi().setGold(true));
        mCards.put("Creature_GL_TravelinSkeleton", new TravelinSkeleton().setGold(true));
        mCards.put("Creature_GL_TravelinWizard", new TravelinWizard().setGold(true));
        mCards.put("Creature_GL_TreeEvil", new TreeOfUnderneath().setGold(true));
        mCards.put("Creature_GL_WallOfSand", new WallOfSand().setGold(true));
        mCards.put("Creature_GL_WanderingBaldMan", new WanderingBaldMan().setGold(true));
        mCards.put("Creature_GL_WellDressedWolf", new WellDressedWolf().setGold(true));
        mCards.put("Creature_GL_WhiteNinja", new WhiteNinja().setGold(true));
        mCards.put("Creature_GL_WizardElf", new PsionicArchitect().setGold(true));
        mCards.put("Creature_GrapeSlimey", new GrapeSlimey());
        mCards.put("Creature_GrayEyeBat", new GrayEyebat());
        mCards.put("Creature_GreenMermaid", new GreenMermaid());
        mCards.put("Creature_GreenMerman", new GreenMerman());
        mCards.put("Creature_GreenSnakey", new GreenSnakey());
        mCards.put("Creature_Herculeye", new Herculeye());
        mCards.put("Creature_HotEyeBat", new HotEyebat());
        mCards.put("Creature_HuskerGiant", new HuskerGiant());
        mCards.put("Creature_HuskerKnight", new HuskerKnight());
        mCards.put("Creature_IceIceBaby", new NiceIceBaby());
        mCards.put("Creature_IceKnight", new IcePaladin());
        mCards.put("Creature_KingFluff", new GoodKingWonderful());
        mCards.put("Creature_KnightOfObesity", new XLargeSpiritSoldier());
        mCards.put("Creature_LadyScarab", new LadyMary());
        mCards.put("Creature_LegionOfEarlings", new LegionOfEarlings());
        mCards.put("Creature_LimeSlimey", new LimeSlimey());
        mCards.put("Creature_LostGolem", new LostGolem());
        mCards.put("Creature_MaizeWalker", new ImmortalMaizeWalker());
        mCards.put("Creature_ManowarElf", new WoadicTimeWalker());
        mCards.put("Creature_MermaidYellow", new MaryAnn());
        mCards.put("Creature_MotherFluffBucket", new MotherFluffBucket());
        mCards.put("Creature_Mouthball", new Mouthball());
        mCards.put("Creature_MsMummy", new MsMummy());
        mCards.put("Creature_MudAngel", new MudAngel());
        mCards.put("Creature_Ninja", new OrdinaryNinja());
        mCards.put("Creature_OrangeSlimey", new OrangeSlimey());
        mCards.put("Creature_PatchyThePumpkin", new PatchyThePumpkin());
        mCards.put("Creature_PeachDjini", new PeachDjini());
        mCards.put("Creature_Pentacutie", new DetectiveBobby());
        mCards.put("Creature_Phyllis", new Phyllis());
        mCards.put("Creature_Pickler", new ThePickler());
        mCards.put("Creature_Pieclops", new Pieclops());
        mCards.put("Creature_Pig", new ThePig());
        mCards.put("Creature_PirateBear", new DaveyBear());
        mCards.put("Creature_PorcelainGuardian", new PorcelainGuardian());
        mCards.put("Creature_Poultrygeist", new Poultrygeist());
        mCards.put("Creature_PunkCat", new PunkCat());
        mCards.put("Creature_Quadurai", new Quadurai());
        mCards.put("Creature_RainbowBarfer", new RainbowBarfer());
        mCards.put("Creature_RecordThug", new RecordThug());
        mCards.put("Creature_RedEyeling", new RedEyeling());
        mCards.put("Creature_Rocktopus", new DetectiveSally());
        mCards.put("Creature_SackOfPain", new SackOPain());
        mCards.put("Creature_SandEyeBat", new SandEyebat());
        mCards.put("Creature_SandFoot", new Sandfoot());
        mCards.put("Creature_SandJackal", new SandJackal());
        mCards.put("Creature_SandKnight", new SandKnight());
        mCards.put("Creature_SandShark", new Sandy());
        mCards.put("Creature_SandSnake", new SandSnake());
        mCards.put("Creature_Sandwitch", new Sandwitch());
        mCards.put("Creature_SgtMushroom", new SgtMushroom());
        mCards.put("Creature_SkeletalHand", new BurningHand());
        mCards.put("Creature_Sludger", new TheSludger());
        mCards.put("Creature_SnakeMint", new SnakeMint());
        mCards.put("Creature_SnappyDresser", new SnappyDresser());
        mCards.put("Creature_SnuggleTree", new SnuggleTree());
        mCards.put("Creature_SoftEyeling", new SoftEyeling());
        mCards.put("Creature_SpikedMaceStump", new MaceStump());
        mCards.put("Creature_SteakChop", new SteakChop());
        mCards.put("Creature_StruzanJinn", new StruzannJinn());
        mCards.put("Creature_SugarImp", new ImprovedSugarImp());
        mCards.put("Creature_TeethLeaf", new TeethLeaf());
        mCards.put("Creature_TheDrooler", new DroolingDude());
        mCards.put("Creature_TheMariachi", new TheMariachi());
        mCards.put("Creature_TravelinSkeleton", new TravelinSkeleton());
        mCards.put("Creature_TravelinWizard", new TravelinWizard());
        mCards.put("Creature_TreeEvil", new TreeOfUnderneath());
        mCards.put("Creature_WallOfSand", new WallOfSand());
        mCards.put("Creature_WanderingBaldMan", new WanderingBaldMan());
        mCards.put("Creature_WellDressedWolf", new WellDressedWolf());
        mCards.put("Creature_WhiteNinja", new WhiteNinja());
        mCards.put("Creature_WizardElf", new PsionicArchitect());
        mCards.put("Creature_BL_LogKnight", new LogKnight());
        mCards.put("Creature_BL_SunKing", new SunKing());
        mCards.put("Creature_BL_PointyYellowGnome", new YellowGnome());
        mCards.put("Creature_BL_UselessThrone", new BaldMansThrone());
        mCards.put("Creature_BL_EyeGuy", new EyeGuy());
        mCards.put("Creature_BL_HeadphoneJerk", new MarkyMark());
        mCards.put("Creature_BL_AppleBully", new AppleTree());
        mCards.put("Creature_BL_Fatapillar", new Fatapillar());
        mCards.put("Creature_BL_NicelandsCutie", new NicelandsCutie());
        mCards.put("Creature_BL_GreenPartyOgre", new GreenPartyOgre());
        mCards.put("Creature_BL_SandasaurusRex", new SandasaurusRex());
        mCards.put("Creature_BL_TimmyMagicEyes", new TimmyMagicEyes());
        mCards.put("Creature_BL_CameraDude", new CameraDude());
        mCards.put("Creature_BL_InfiniteFigure", new InfiniteFigure());
        mCards.put("Creature_GL_FisherFish", new FisherFish().setGold(true));
        mCards.put("Creature_GL_BrainGooey", new BrainGooey().setGold(true));
        
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
        } else if ("Plains".equalsIgnoreCase(faction)) {
            return Faction.BluePlains;
        } else if ("Corn".equalsIgnoreCase(faction)) {
            return Faction.CornFields;
        } else if ("Cotton".equalsIgnoreCase(faction)) {
            return Faction.NiceLands;
        } else if ("Sand".equalsIgnoreCase(faction)) {
            return Faction.SandyLands;
        } else if ("Swamp".equalsIgnoreCase(faction)) {
            return Faction.UselessSwamp;

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

package com.kevinquan.cwa.model;

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
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.ThePickler;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.creatures.rainbow.WhiteNinja;
import com.kevinquan.cwa.model.spells.BoneWand;
import com.kevinquan.cwa.model.spells.BriefPower;
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
import com.kevinquan.cwa.model.spells.Volcano;
import com.kevinquan.cwa.model.spells.WizardMigrane;
import com.kevinquan.cwa.model.spells.WoadBlood;

public class RainbowCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = RainbowCardStore.class.getSimpleName();

    @Override
    protected void init() {
        // Cool cards
        addCard(new ImprovedSugarImp());
        addCard(new Mouthball());
        addCard(new NiceIceBaby());
        addCard(new OrdinaryNinja());
        addCard(new ThePig());
        addCard(new TravelinSkeleton());
        
        // Nice cards
        addCard(new EvilEye());
        addCard(new WhiteNinja());
        
        // Very Rare cards
        addCard(new ThePickler());
        
        // Buildings
        addCard(new AstralFortress());
        addCard(new CaveOfSolitude());
        addCard(new ComfyCave());
        addCard(new CornCastle());
        addCard(new CornDome());
        addCard(new CornParthenon());
        addCard(new NicelandsTower());
        addCard(new ObelisxOfVengence());
        addCard(new PalaceOfBone());
        addCard(new PuffyCastle());
        addCard(new Pyramidia());
        addCard(new SandCastle());
        addCard(new SandPyramid());
        addCard(new SandSphinx());
        addCard(new SchoolHouse());
        addCard(new SiloOfTruth());
        addCard(new SpiritTower());
        addCard(new WoadMobileHome());
        
        // Spells
        addCard(new BoneWand());
        addCard(new BriefPower());
        addCard(new CerebralBloodstorm());
        addCard(new CornScepter());
        addCard(new CrystalBall());
        addCard(new FountainOfForgiveness());
        addCard(new GrapeButt());
        addCard(new PumaClaw());
        addCard(new ScrollOfFreshBreath());
        addCard(new PsychicTempest());
        addCard(new StrawberryButt());
        addCard(new SuperHug());
        addCard(new Teleport());
        addCard(new TomeOfAnkhs());
        addCard(new UfoAbduction());
        addCard(new Volcano());
        addCard(new WizardMigrane());
        addCard(new WoadBlood());
    }

}

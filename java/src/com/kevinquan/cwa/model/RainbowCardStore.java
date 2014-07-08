package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.ComfyCave;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.buildings.SandCastle;
import com.kevinquan.cwa.model.creatures.rainbow.EvilEye;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.spells.BoneWand;
import com.kevinquan.cwa.model.spells.BriefPower;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.CrystalBall;
import com.kevinquan.cwa.model.spells.FountainOfForgiveness;
import com.kevinquan.cwa.model.spells.GrapeButt;
import com.kevinquan.cwa.model.spells.PsychicTempest;
import com.kevinquan.cwa.model.spells.StrawberryButt;
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
        
        // Buildings
        addCard(new AstralFortress());
        addCard(new ComfyCave());
        addCard(new CornDome());
        addCard(new SandCastle());
        
        // Spells
        addCard(new BoneWand());
        addCard(new BriefPower());
        addCard(new CerebralBloodstorm());
        addCard(new CrystalBall());
        addCard(new FountainOfForgiveness());
        addCard(new GrapeButt());
        addCard(new PsychicTempest());
        addCard(new StrawberryButt());
        addCard(new Teleport());
        addCard(new TomeOfAnkhs());
        addCard(new UfoAbduction());
        addCard(new Volcano());
        addCard(new WizardMigrane());
        addCard(new WoadBlood());
    }

}

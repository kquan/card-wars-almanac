package com.kevinquan.cwa.model;

import com.kevinquan.cwa.model.buildings.AstralFortress;
import com.kevinquan.cwa.model.buildings.ComfyCave;
import com.kevinquan.cwa.model.buildings.CornDome;
import com.kevinquan.cwa.model.buildings.SandCastle;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.spells.BriefPower;
import com.kevinquan.cwa.model.spells.CerebralBloodstorm;
import com.kevinquan.cwa.model.spells.CrystalBall;
import com.kevinquan.cwa.model.spells.StrawberryButt;
import com.kevinquan.cwa.model.spells.Volcano;
import com.kevinquan.cwa.model.spells.WizardMigrane;
import com.kevinquan.cwa.model.spells.WoadBlood;

public class RainbowCardStore extends AbstractCardStore {

    @SuppressWarnings("unused")
    private static final String TAG = RainbowCardStore.class.getSimpleName();

    @Override
    protected void init() {
        addCard(new Mouthball());
        addCard(new ThePig());
        
        // Buildings
        addCard(new AstralFortress());
        addCard(new ComfyCave());
        addCard(new CornDome());
        addCard(new SandCastle());
        
        // Spells
        addCard(new BriefPower());
        addCard(new CerebralBloodstorm());
        addCard(new CrystalBall());
        addCard(new StrawberryButt());
        addCard(new Volcano());
        addCard(new WizardMigrane());
        addCard(new WoadBlood());
    }

}

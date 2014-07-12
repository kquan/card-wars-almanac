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
import com.kevinquan.cwa.model.creatures.rainbow.GreenSnakey;
import com.kevinquan.cwa.model.creatures.rainbow.ImprovedSugarImp;
import com.kevinquan.cwa.model.creatures.rainbow.Mouthball;
import com.kevinquan.cwa.model.creatures.rainbow.NiceIceBaby;
import com.kevinquan.cwa.model.creatures.rainbow.OrdinaryNinja;
import com.kevinquan.cwa.model.creatures.rainbow.PeachDjini;
import com.kevinquan.cwa.model.creatures.rainbow.ThePickler;
import com.kevinquan.cwa.model.creatures.rainbow.ThePig;
import com.kevinquan.cwa.model.creatures.rainbow.TravelinSkeleton;
import com.kevinquan.cwa.model.creatures.rainbow.WhiteNinja;
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
        addCard(new GreenSnakey());
        addCard(new PeachDjini());
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
        addCard(new BananaButt());
        addCard(new BoneWand());
        addCard(new BriefPower());
        addCard(new BubblegumButt());
        addCard(new CerebralBloodstorm());
        addCard(new ClairvoyantDaggerstorm());
        addCard(new CornScepter());
        addCard(new CoughSyrup());
        addCard(new CrystalBall());
        addCard(new DarkPortal());
        addCard(new DoorOfStrength());
        addCard(new FallingStar());
        addCard(new FieldOfNightmares());
        addCard(new FountainOfForgiveness());
        addCard(new GrapeButt());
        addCard(new HotDogRain());
        addCard(new PieStorm());
        addCard(new PortalToNowhere());
        addCard(new PsychicTempest());
        addCard(new PumaClaw());
        addCard(new ScrollOfBadBreath());
        addCard(new ScrollOfFreshBreath());
        addCard(new SkullJuice());
        addCard(new SnakeEyeRing());
        addCard(new SpiritTorch());
        addCard(new StrawberryButt());
        addCard(new SuperHug());
        addCard(new Teleport());
        addCard(new ThroneOfDoom());
        addCard(new ThroneOfGloom());
        addCard(new TomeOfAnkhs());
        addCard(new UfoAbduction());
        addCard(new UltimateMagicHands());
        addCard(new UnemptyCoffin());
        addCard(new Volcano());
        addCard(new WitchWay());
        addCard(new WizardMigrane());
        addCard(new WizardRawk());
        addCard(new WoadBlood());
        addCard(new ZaZosMagicSeeds());
    }

}

package com.example.mechwarriorcompanionapp.mech;

import com.example.mechwarriorcompanionapp.weapon.Weapon;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Slot {
    private String loc;
    @Embedded
    private Weapon weapon;

    public Slot() {
    }

    public Slot(String loc, Weapon weapon) {
        this.loc = loc;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "loc='" + loc + '\'' +
                ", weapon=" + weapon +
                '}';
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

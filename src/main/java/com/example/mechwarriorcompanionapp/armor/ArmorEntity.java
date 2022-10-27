package com.example.mechwarriorcompanionapp.armor;

import javax.persistence.*;

@Entity
public class ArmorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String armorLoc;
    private int armorMaxHitPoints;
    private int armorHits;

    public ArmorEntity() {
    }

    public ArmorEntity(String loc, int maxHitPoints) {
        this.armorLoc = loc;
        this.armorMaxHitPoints = maxHitPoints;
        this.armorHits = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArmorLoc() {
        return armorLoc;
    }

    public void setArmorLoc(String armorLoc) {
        this.armorLoc = armorLoc;
    }

    public int getArmorMaxHitPoints() {
        return armorMaxHitPoints;
    }

    public void setArmorMaxHitPoints(int armorMaxHitPoints) {
        this.armorMaxHitPoints = armorMaxHitPoints;
    }

    public int getArmorHits() {
        return armorHits;
    }

    public void setArmorHits(int armorHitPoints) {
        this.armorHits = armorHitPoints;
    }
}

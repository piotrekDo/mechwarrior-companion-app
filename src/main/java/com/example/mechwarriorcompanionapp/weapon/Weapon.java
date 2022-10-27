package com.example.mechwarriorcompanionapp.weapon;

import javax.persistence.*;

@Entity
@Embeddable
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String weaponType;
    @Embedded
    private Range range;
    private int damage;

    public Weapon() {
    }

    public Weapon(String weaponType, Range range, int damage) {
        this.weaponType = weaponType;
        this.range = range;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", weaponType='" + weaponType + '\'' +
                ", range=" + range +
                ", damage=" + damage +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

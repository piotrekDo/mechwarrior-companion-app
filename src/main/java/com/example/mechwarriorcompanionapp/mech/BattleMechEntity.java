package com.example.mechwarriorcompanionapp.mech;

import com.example.mechwarriorcompanionapp.armor.ArmorEntity;
import com.example.mechwarriorcompanionapp.internal_structure.InternalStructureEntity;

import javax.persistence.*;

@Entity
public class BattleMechEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Embedded
    private MechData mechData;
    @Embedded
    private WeaponsAndEquipment weaponsAndEquipment;
    @OneToOne
    private ArmorEntity headArmor;
    @OneToOne
    private InternalStructureEntity headStructure;
    @OneToOne
    private ArmorEntity centerTorsoArmor;
    @OneToOne
    private InternalStructureEntity centerTorsoStructure;

    public BattleMechEntity() {
    }

    public BattleMechEntity(MechData mechData, WeaponsAndEquipment weaponsAndEquipment, ArmorEntity headArmor, InternalStructureEntity headStructure, ArmorEntity centerTorsoArmor, InternalStructureEntity centerTorsoStructure) {
        this.mechData = mechData;
        this.weaponsAndEquipment = weaponsAndEquipment;
        this.headArmor = headArmor;
        this.headStructure = headStructure;
        this.centerTorsoArmor = centerTorsoArmor;
        this.centerTorsoStructure = centerTorsoStructure;
    }

    @Override
    public String toString() {
        return "BattleMechEntity{" +
                "id=" + id +
                ", mechData=" + mechData +
                ", weaponsAndEquipment=" + weaponsAndEquipment +
                ", headArmor=" + headArmor +
                ", headStructure=" + headStructure +
                ", centerTorsoArmor=" + centerTorsoArmor +
                ", centerTorsoStructure=" + centerTorsoStructure +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MechData getMechData() {
        return mechData;
    }

    public void setMechData(MechData mechData) {
        this.mechData = mechData;
    }

    public WeaponsAndEquipment getWeaponsAndEquipment() {
        return weaponsAndEquipment;
    }

    public void setWeaponsAndEquipment(WeaponsAndEquipment weaponsAndEquipment) {
        this.weaponsAndEquipment = weaponsAndEquipment;
    }

    public ArmorEntity getHeadArmor() {
        return headArmor;
    }

    public void setHeadArmor(ArmorEntity headArmor) {
        this.headArmor = headArmor;
    }

    public InternalStructureEntity getHeadStructure() {
        return headStructure;
    }

    public void setHeadStructure(InternalStructureEntity headStructure) {
        this.headStructure = headStructure;
    }

    public ArmorEntity getCenterTorsoArmor() {
        return centerTorsoArmor;
    }

    public void setCenterTorsoArmor(ArmorEntity centerTorsoArmor) {
        this.centerTorsoArmor = centerTorsoArmor;
    }

    public InternalStructureEntity getCenterTorsoStructure() {
        return centerTorsoStructure;
    }

    public void setCenterTorsoStructure(InternalStructureEntity centerTorsoStructure) {
        this.centerTorsoStructure = centerTorsoStructure;
    }
}

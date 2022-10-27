package com.example.mechwarriorcompanionapp;

import com.example.mechwarriorcompanionapp.armor.ArmorEntity;
import com.example.mechwarriorcompanionapp.armor.ArmorRepository;
import com.example.mechwarriorcompanionapp.internal_structure.InternalStructureEntity;
import com.example.mechwarriorcompanionapp.internal_structure.InternalStructureRepository;
import com.example.mechwarriorcompanionapp.mech.*;
import com.example.mechwarriorcompanionapp.weapon.Range;
import com.example.mechwarriorcompanionapp.weapon.Weapon;
import com.example.mechwarriorcompanionapp.weapon.WeaponRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Initializer {

    private final WeaponRepository weaponRepository;
    private final MechRepository mechRepository;
    private final ArmorRepository armorRepository;
    private final InternalStructureRepository structureRepository;

    public Initializer(WeaponRepository weaponRepository, MechRepository mechRepository, ArmorRepository armorRepository, InternalStructureRepository structureRepository) {
        this.weaponRepository = weaponRepository;
        this.mechRepository = mechRepository;
        this.armorRepository = armorRepository;
        this.structureRepository = structureRepository;
    }

    @PostConstruct
    void init() {
        Weapon small_laser = new Weapon("Small laser", new Range(0, 3, 5, 9), 5);
        weaponRepository.save(small_laser);

        Slot slot = new Slot("LA", small_laser);
        WeaponsAndEquipment weaponsAndEquipment = new WeaponsAndEquipment();
        weaponsAndEquipment.getSlots().add(slot);

        MechData mechData = new MechData(new MovementPoints(2, 5, 9), 85, "Inner Sphere", "Standard", "Brawler");

        ArmorEntity headArmor = new ArmorEntity("HEAD", 9);
        InternalStructureEntity headStructure = new InternalStructureEntity("HEAD", 3);
        armorRepository.save(headArmor);
        structureRepository.save(headStructure);

        ArmorEntity centerTorsoArmor = new ArmorEntity("CT", 40);
        InternalStructureEntity centerTorsoStructure = new InternalStructureEntity("CT", 27);
        armorRepository.save(centerTorsoArmor);
        structureRepository.save(centerTorsoStructure);


        BattleMechEntity battleMechEntity = new BattleMechEntity(mechData, weaponsAndEquipment, headArmor, headStructure, centerTorsoArmor, centerTorsoStructure);
        mechRepository.save(battleMechEntity);

        List<BattleMechEntity> all = mechRepository.findAll();
        System.out.println(all);

    }
}

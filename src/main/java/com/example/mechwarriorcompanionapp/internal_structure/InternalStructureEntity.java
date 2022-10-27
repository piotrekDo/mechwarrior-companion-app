package com.example.mechwarriorcompanionapp.internal_structure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InternalStructureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String structureLoc;
    private int structureMaxHitPoints;
    private int structureHits;

    public InternalStructureEntity() {
    }

    public InternalStructureEntity(String loc, int maxHitPoints) {
        this.structureLoc = loc;
        this.structureMaxHitPoints = maxHitPoints;
        this.structureHits = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStructureLoc() {
        return structureLoc;
    }

    public void setStructureLoc(String structureLoc) {
        this.structureLoc = structureLoc;
    }

    public int getStructureMaxHitPoints() {
        return structureMaxHitPoints;
    }

    public void setStructureMaxHitPoints(int structureMaxHitPoints) {
        this.structureMaxHitPoints = structureMaxHitPoints;
    }

    public int getStructureHits() {
        return structureHits;
    }

    public void setStructureHits(int structureHitPoints) {
        this.structureHits = structureHitPoints;
    }
}

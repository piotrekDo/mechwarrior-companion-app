package com.example.mechwarriorcompanionapp.mech;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Objects;

@Embeddable
 public class MechData {
    @Embedded
    private MovementPoints movementPoints;
    private int tonnage;
    private String techBase;
    private String rulesLevel;
    private String role;

    public MechData() {
    }

    public MechData(MovementPoints movementPoints, int tonnage, String techBase, String rulesLevel, String role) {
        this.movementPoints = movementPoints;
        this.tonnage = tonnage;
        this.techBase = techBase;
        this.rulesLevel = rulesLevel;
        this.role = role;
    }

    @Override
    public String toString() {
        return "MechData{" +
                "movementPoints=" + movementPoints +
                ", tonnage=" + tonnage +
                ", techBase='" + techBase + '\'' +
                ", rulesLevel='" + rulesLevel + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MechData)) return false;
        MechData mechData = (MechData) o;
        return tonnage == mechData.tonnage && Objects.equals(movementPoints, mechData.movementPoints) && Objects.equals(techBase, mechData.techBase) && Objects.equals(rulesLevel, mechData.rulesLevel) && Objects.equals(role, mechData.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementPoints, tonnage, techBase, rulesLevel, role);
    }

    public MovementPoints getMovementPoints() {
        return movementPoints;
    }

    public void setMovementPoints(MovementPoints movementPoints) {
        this.movementPoints = movementPoints;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getTechBase() {
        return techBase;
    }

    public void setTechBase(String techBase) {
        this.techBase = techBase;
    }

    public String getRulesLevel() {
        return rulesLevel;
    }

    public void setRulesLevel(String rulesLevel) {
        this.rulesLevel = rulesLevel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

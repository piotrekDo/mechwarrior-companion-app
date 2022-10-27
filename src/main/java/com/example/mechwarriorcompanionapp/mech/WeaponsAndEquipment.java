package com.example.mechwarriorcompanionapp.mech;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class WeaponsAndEquipment {
    @ElementCollection(fetch = FetchType.EAGER)
    List<Slot> slots = new ArrayList<>();

    @Override
    public String toString() {
        return "WeaponsAndEquipment{" +
                "slots=" + slots +
                '}';
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}

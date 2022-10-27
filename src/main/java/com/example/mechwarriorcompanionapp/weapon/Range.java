package com.example.mechwarriorcompanionapp.weapon;

import javax.persistence.Embeddable;

@Embeddable
public
class Range {
    private int rangeMinimum;
    private int rangeShort;
    private int rangeMedium;
    private int rangeLong;

    public Range() {
    }

    public Range(int rangeMinimum, int rangeShort, int rangeMedium, int rangeLong) {
        this.rangeMinimum = rangeMinimum;
        this.rangeShort = rangeShort;
        this.rangeMedium = rangeMedium;
        this.rangeLong = rangeLong;
    }

    @Override
    public String toString() {
        return "Range{" +
                "rangeMinimum=" + rangeMinimum +
                ", rangeShort=" + rangeShort +
                ", rangeMedium=" + rangeMedium +
                ", rangeLong=" + rangeLong +
                '}';
    }

    public int getRangeMinimum() {
        return rangeMinimum;
    }

    public void setRangeMinimum(int rangeMinimum) {
        this.rangeMinimum = rangeMinimum;
    }

    public int getRangeShort() {
        return rangeShort;
    }

    public void setRangeShort(int rangeShort) {
        this.rangeShort = rangeShort;
    }

    public int getRangeMedium() {
        return rangeMedium;
    }

    public void setRangeMedium(int rangeMedium) {
        this.rangeMedium = rangeMedium;
    }

    public int getRangeLong() {
        return rangeLong;
    }

    public void setRangeLong(int rangeLong) {
        this.rangeLong = rangeLong;
    }
}

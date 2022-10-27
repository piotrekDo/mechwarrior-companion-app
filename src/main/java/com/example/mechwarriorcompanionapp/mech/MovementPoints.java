package com.example.mechwarriorcompanionapp.mech;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public
class MovementPoints {
    private int walking;
    private int running;
    private int jumping;

    public MovementPoints() {
    }

     public MovementPoints(int walking, int running, int jumping) {
        this.walking = walking;
        this.running = running;
        this.jumping = jumping;
    }

    @Override
    public String toString() {
        return "MovementPoints{" +
                "walking=" + walking +
                ", running=" + running +
                ", jumping=" + jumping +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovementPoints)) return false;
        MovementPoints that = (MovementPoints) o;
        return walking == that.walking && running == that.running && jumping == that.jumping;
    }

    @Override
    public int hashCode() {
        return Objects.hash(walking, running, jumping);
    }

    public int getWalking() {
        return walking;
    }

    public void setWalking(int walking) {
        this.walking = walking;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getJumping() {
        return jumping;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }
}

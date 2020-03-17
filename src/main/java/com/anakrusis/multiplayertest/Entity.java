package com.anakrusis.multiplayertest;

import java.io.Serializable;
import java.util.UUID;

public class Entity implements Serializable {

    protected double x;
    protected double y;
    protected float dir; // radians
    transient protected World world;
    protected String name;

    private static final long serialVersionUID = 6529685098267757690L;
    protected UUID uuid;

    public Entity(double x, double y, float dir, World world){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.world = world;
        this.name = "Entity";

        this.uuid = UUID.randomUUID();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public float getDir() {
        return dir;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setDir(float dir) {
        this.dir = dir;
    }

    public UUID getUuid() {
        return uuid;
    }
}

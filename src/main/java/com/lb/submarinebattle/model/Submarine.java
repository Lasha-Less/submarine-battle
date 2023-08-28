package com.lb.submarinebattle.model;

import java.util.ArrayList;

public abstract class Submarine {
    protected int size;

    protected ArrayList<Cell> locationCells;
    protected ArrayList<Cell> marginalSpace;
    protected Shape shape;
    protected Orientation orientation;

    public Submarine(int size, Shape shape, Orientation orientation) {
        this.size = size;
        this.shape = shape;
        this.orientation = orientation;
        this.locationCells = new ArrayList<>();
        this.marginalSpace = new ArrayList<>();
    }

    public boolean isSunk() {
        for (Cell cell : locationCells) {
            if (!cell.isHit()) {  // Assuming Cell has a method isHit()
                return false;
            }
        }
        return true;
    }

    public int getSize(){
        return size;
    }
}
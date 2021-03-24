package com.codecool.farm.animal;

public class Cattle extends Animal {
    private int size = 0;

    @Override
    public void feed() {
        size += 2;
    }

    @Override
    public int getSize() {
        return size;
    }
}

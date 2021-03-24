package com.codecool.farm.animal;

public class Pig extends Animal {
    private int size = 0;

    @Override
    public void feed() {
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }
}

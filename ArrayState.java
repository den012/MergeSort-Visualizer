package com.example.mergesortvisual;

public class ArrayState {
    private final int[] array;
    private final int firstIndex;
    private final int secondIndex;

    public ArrayState(int[] array, int firstIndex, int secondIndex) {
        this.array = array;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }

    public int[] getArray() {
        return array;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getSecondIndex() {
        return secondIndex;
    }
}

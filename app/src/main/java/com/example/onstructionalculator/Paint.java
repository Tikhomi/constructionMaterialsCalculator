// Paint.java

package com.example.onstructionalculator;

import java.io.Serializable;

public class Paint implements Serializable {
    private int count;
    private int totalCost;

    public Paint(int count, int totalCost) {
        this.count = count;
        this.totalCost = totalCost;
    }

    // геттеры для получения значений count и totalCost
    public int getCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }
}

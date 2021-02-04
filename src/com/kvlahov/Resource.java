package com.kvlahov;

public class Resource {
    private double maxQuantity;
    private double currentQuantity;

    public Resource(double maxQuantity) {
        this.maxQuantity = maxQuantity;
        this.currentQuantity = maxQuantity;
    }

    public Resource(double maxQuantity, double currentQuantity) {
        this.maxQuantity = maxQuantity;
        this.currentQuantity = currentQuantity;
    }

    public double getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(double maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public double getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(double currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public double getCurrentQuantityPercentage() {
        if (maxQuantity == 0) return 0;
        return currentQuantity / maxQuantity;
    }

    public void fillToMaximum() {
        this.currentQuantity = this.maxQuantity;
    }
}

package net.xgui4.Hardware.Component;

public abstract class Battery {
    private int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public abstract void degradeHealth();
}

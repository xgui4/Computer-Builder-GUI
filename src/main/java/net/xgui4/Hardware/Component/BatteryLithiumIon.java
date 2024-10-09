package net.xgui4.Hardware.Component;

public class BatteryLithiumIon extends Battery {
    private boolean isSpicyPillow;
    private final int capacityThreshold;

    public BatteryLithiumIon(int capacity, int capacityThreshold) {
        super(capacity);
        this.isSpicyPillow = false;
        this.capacityThreshold = capacityThreshold;
    }

    @Override
    public void degradeHealth() {
       super.setCapacity(getCapacity() - 10);
       if (getCapacity() < capacityThreshold) {
           inflate();
       }
    }

    public boolean getIsSpicyPillow() {
        return isSpicyPillow;
    }

    public void inflate() {
        this.isSpicyPillow = true;
    }

    public void checkStatus() {
        if (isSpicyPillow) {
            System.out.println("Warning: Battery is swollen!");
        } else {
            System.out.println("Battery is in good condition.");
        }
    }
}

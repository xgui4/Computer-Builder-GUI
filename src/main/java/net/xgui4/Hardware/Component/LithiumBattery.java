package net.xgui4.Hardware.Component;

public class LithiumBattery extends Battery {
    private LithiumBatteryStatus lithiumBatteryStatus;
    private final int capacityThreshold;

    public LithiumBattery(int capacity, int capacityThreshold) {
        super(capacity);
        lithiumBatteryStatus = LithiumBatteryStatus.NEW;
        this.capacityThreshold = capacityThreshold;
    }

    public LithiumBattery(String manufacturer, String model, String name, int capacity, int capacityThreshold) {
        super(manufacturer, model, name, capacity);
        lithiumBatteryStatus = LithiumBatteryStatus.NEW;
        this.capacityThreshold = capacityThreshold;
    }

    @Override
    public void degradeHealth() {
       super.setCapacity(getCapacity() - 10);
       if (getCapacity() < capacityThreshold) {
           lithiumBatteryStatus = LithiumBatteryStatus.BAD;
       }
    }

    /**
     * Génère les détailles lisible de la batterie.
     * @return les détailles de la batterie
     */
    @Override
    public String getSummary(){
        return "Manufacturer : " + super.getManufacturer() + "\n" +
                "Model : " +  super.getModel() + "\n" +
                "Name : " + super.getName() + "\n" +
                "Capacity : " + super.getCapacity() + "\n" +
                "Status : " + this.getLithiumBatteryStatus().getMessage();
    }

    public void inflate() {
        lithiumBatteryStatus = LithiumBatteryStatus.INFLATED;
    }

    public LithiumBatteryStatus getLithiumBatteryStatus() {
        return lithiumBatteryStatus;
    }

    /**
     * Cette méthode est pour utilisation de débogage uniquement.
     * @return Toutes les détailles de la batteries.
     */
    @Override
    public String toString() {
        return "LithiumBattery : " + "'" + super.toString() +
                "lithiumBatteryStatus=" + "'" + lithiumBatteryStatus + "'"+ "," +
                "capacityThreshold=" + capacityThreshold;
    }
}

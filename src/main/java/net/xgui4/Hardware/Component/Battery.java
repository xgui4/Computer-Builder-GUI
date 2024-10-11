package net.xgui4.Hardware.Component;

public abstract class Battery {
    private String manufacturer;
    private String model;
    private String name;
    private int capacity;

    /**
     * Le contructueur de Battery
     * @param capacity
     */
    public Battery(String manufacturer, String model, String name, int capacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Le contructueur de Battery, avec le manufacturier, le modèle et le name avec leur valeur par défaut.
     * @param capacity
     */
    public Battery(int capacity) {
        manufacturer = "Microsoft";
        model = "Generic Battery";
        name = "Generic Battery Driver";
        this.capacity = capacity;
    }

    /**
     * le getter de la capacité
     * @return la capacité
     */
    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Le getter de l'attribut modèle
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Le getter de l'attribut name
     * @return le nom
     */
    public String getName() {
        return name;
    }

    /**
     * Le getter de l'attribut manufacturer
     * @return le manufacturier
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Génère les détailles lisible de la batterie.
     * @return les détailles de la batterie
     */
    public String getSummary() {
        return "Manufacturer : " + getManufacturer() + "\n" +
                "Model : " +  getModel() + "\n" +
                "Name : " + getName() + "\n" +
                "Capacity : " + getCapacity() + "\n";
    }

    /**
     * Réduit la santé de la batterie
     */
    public abstract void degradeHealth();
}

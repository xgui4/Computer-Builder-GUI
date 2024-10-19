package net.xgui4.Hardware.ComputerType;

import net.xgui4.Hardware.PowerState;

/**
 * Cette classe abstraite représente un ordinateur
 */
public abstract class Computer {
    private PowerState powerState;

    public Computer() {
        powerState = PowerState.OFF;
    }

    /**
     * Cette méthode permet de démarrer l'ordinateur
     */
    protected void setPowerOn() {
        powerState = PowerState.ON;
    }

    /**
     * Cette méthode permet d'éteindre l'ordinateur
     */
    protected void setPowerOff() {
        powerState = PowerState.OFF;
    }

    /**
     * Cette méthode abstraite permet de démarrer l'ordinateur
     */
    public abstract void powerOn();

    /**
     * Cette méthode abstraite permet d'éteindre l'ordinateur
     */
    public abstract void powerOff();

    /**
     * Cette méthode abstraite permet de fermer le système d'exploitation et l'ordinateur correctement
     */
    public abstract void shutdown();
}

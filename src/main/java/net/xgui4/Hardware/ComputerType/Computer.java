package net.xgui4.Hardware.ComputerType;

import net.xgui4.Exception.NoBatteryInComputerException;
import net.xgui4.Hardware.Component.Battery;
import net.xgui4.Hardware.PowerState;

/**
 * Cette classe abstraite représente un ordinateur
 */
public abstract class Computer {
    private PowerState powerState;

    /**
     * Le constructeur d'un ordinateur
     */
    public Computer() {
        powerState = PowerState.OFF;
    }

    /**
     * Cette méthode permet de démarrer l'ordinateur
     */
        powerState = PowerState.ON;
    }

    /**
     * Cette méthode permet d'éteindre l'ordinateur
     */
    public void setPowerOff() {
        powerState = PowerState.OFF;
    }

    public void boot() {
        powerOn();
    }

    public abstract void getInfo(Battery battery);

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

    /**
     * Le getter de l'état d'alimentation de l'ordinateur
     * @return l'état de l'ordinateur (Enum PowerState)
     */
    public PowerState getState() {
        return powerState;
    }

    /**
     * Le getter de la battery
     * @return la battery si l'ordinateur possède une batterie (interface Battery)
     * @exception NoBatteryInComputerException lance une excpetion si la classe d'implémentation ne possède pas de batteriy
     */
    public abstract Battery getBattery();
}

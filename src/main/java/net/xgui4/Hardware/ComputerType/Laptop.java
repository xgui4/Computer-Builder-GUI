package net.xgui4.Hardware.ComputerType;

import net.xgui4.Hardware.Component.Battery;
import net.xgui4.Software.Firmware.Firmware;
import net.xgui4.Software.OperatingSystem.OperatingSystem;

/**
 * Cette classe abstraite représente un ordinateur portable (laptop)
 */
public class Laptop extends Computer {
    Battery battery;
    Firmware firmware;
    OperatingSystem os;

    /**
     * Le contructeur d'un ordinateur portable
     *
     * @param battery  : une batterie (l'interface Battery)
     * @param firmware : le micrologiciel de la carte mère (interface Firmware)
     * @param os       : le système d'exploitation (La classe OperatingSystem)
     */
    public Laptop(Battery battery, Firmware firmware, OperatingSystem os) {
        super();
        this.battery = battery;
        this.firmware = firmware;
        this.os = os;
    }

    /**
     * Le getter de la battery
     *
     * @return une batterie (interface Battery)
     */
    @Override
    public Battery getBattery() {
        return battery;
    }

    /**
     * Cette méthode abstraite permet de démarrer l'ordinateur
     */
    @Override
    public void powerOn() {
        setPowerOn();
        os.boot();
    }

    /**
     * Cette méthode abstraite permet d'éteindre l'ordinateur
     */
    @Override
    public void powerOff() {
        setPowerOff();
    }

    /**
     * Cette méthode permet de fermer le système d'exploitation et l'ordinateur correctement
     */
    @Override
    public void shutdown() {
        powerOff();
        os.shutdown();
    }
}

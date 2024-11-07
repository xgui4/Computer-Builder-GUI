package net.xgui4.Hardware.ComputerType;

import net.xgui4.Hardware.Component.Power.Battery;

public class Desktop extends Computer{
    /**
     * @param battery
     */
    @Override
    public void getInfo(Battery battery) {

    }

    /**
     * Cette méthode abstraite permet de démarrer l'ordinateur
     */
    @Override
    public void powerOn() {
        super.setPowerOn();
    }

    /**
     * Cette méthode abstraite permet d'éteindre l'ordinateur
     */
    @Override
    public void powerOff() {
        super.setPowerOff();
    }

    /**
     * Cette méthode abstraite permet de fermer le système d'exploitation et l'ordinateur correctement
     */
    @Override
    public void shutdown() {
        setPowerOff();
    }

    /**
     * Le getter de la battery
     *
     * @return la battery si l'ordinateur possède une batterie (interface Battery)
     * @throws NoBatteryInComputerException lance une excpetion si la classe d'implémentation ne possède pas de batteriy
     */
    @Override
    public Battery getBattery() {
        return null;
    }
}

package net.xgui4;

import net.xgui4.Hardware.Component.BatteryLithiumIon;

public class Simulator {
    public static void main(String[] args) {
        BatteryLithiumIon battery = new BatteryLithiumIon(1000, 100);

        battery.checkStatus();

        for (int i = 0; i < 100; i++) {
            battery.degradeHealth();
        }

        battery.checkStatus();
    }
}
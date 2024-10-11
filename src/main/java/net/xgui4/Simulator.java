package net.xgui4;

import net.xgui4.Hardware.Component.LithiumBattery;

public class Simulator {
    public static void main(String[] args) {
        LithiumBattery battery = new LithiumBattery(1000, 100);

        System.out.println(battery.getSummary());

        System.out.println(battery.getLithiumBatteryStatus().getMessage());

        for (int i = 0; i < 100; i++) {
            battery.degradeHealth();
        }

        System.out.println(battery.getLithiumBatteryStatus().getMessage());
    }
}
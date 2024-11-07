package net.xgui4.Hardware.ComputerType;

import net.xgui4.Hardware.Component.Power.Battery;
import net.xgui4.Software.Firmware.Firmware;
import net.xgui4.Software.OperatingSystem.OperatingSystem;

public class ComputerFactory {
    public Computer createComputer(ComputerType type, Battery battery, Firmware firmware, OperatingSystem system) {
        switch (type) {
            case LAPTOP -> {
                return new Laptop(battery, firmware, system);
            }
            case DESKTOP -> {
                return new Desktop();
            }
        }

    }
}
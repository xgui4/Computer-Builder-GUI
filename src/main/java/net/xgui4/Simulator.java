package net.xgui4;

import net.xgui4.Hardware.Component.LithiumBattery;
import net.xgui4.Hardware.ComputerType.Computer;
import net.xgui4.Hardware.ComputerType.Laptop;
import net.xgui4.Software.Firmware.Firmware;
import net.xgui4.Software.Firmware.SplashScreen;
import net.xgui4.Software.Firmware.UEFI;
import net.xgui4.Software.OperatingSystem.OperatingSystem;

public class Simulator {
    public static void main(String[] args) {
        OperatingSystem microsoftWindows11 = new OperatingSystem("Microsoft Windows 11");
        Firmware microsoftUEFI = new UEFI("Microsoft Surface UEFI", new SplashScreen(), "Microsoft");
        Laptop microsoftSurface = new Laptop(new LithiumBattery("Microsoft", "Generic Battery", "Generic Battery", 1000, 100), microsoftUEFI, microsoftWindows11);

        microsoftUEFI.post();

        microsoftSurface.powerOn();

        LithiumBattery battery = (LithiumBattery) microsoftSurface.getBattery();

        System.out.println(battery.getSummary());

        System.out.println(battery.getLithiumBatteryStatus().getMessage());

        for (int i = 0; i < 100; i++) {
            battery.degradeHealth();
        }

        System.out.println(battery.getLithiumBatteryStatus().getMessage());

        microsoftSurface.shutdown();
    }
}
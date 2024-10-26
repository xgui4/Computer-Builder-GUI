package net.xgui4;

import net.xgui4.Hardware.Component.LithiumBattery;
import net.xgui4.Hardware.ComputerType.Laptop;
import net.xgui4.Software.Firmware.Firmware;
import net.xgui4.Software.Firmware.UEFI;
import net.xgui4.Software.OperatingSystem.OperatingSystem;
import net.xgui4.Software.OperatingSystem.Windows;

import java.util.Scanner;

/**
 * Ceci est l'ébauche de l'applis/jeux
 */
public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your computer type 1 (Laptop), 2 (Desktop : coming soon): ");
        int computerType = scanner.nextInt();

        if (computerType != 1) {
            System.out.println("Invalid computer type");
        }

        scanner.close();

        Player player = new Player(username);

        OperatingSystem microsoftWindows11 = new Windows("Microsoft Windows 11");
        Firmware microsoftUEFI = new UEFI("Microsoft Surface UEFI", "Microsoft");
        Laptop microsoftSurface = new Laptop(new LithiumBattery("Microsoft", "Generic Battery", "Generic Battery", 1000, 100), microsoftUEFI, microsoftWindows11);

        player.chooseComputer(microsoftSurface);

        player.play();
        
        player.analyse();

        player.quit();

    }
}
package net.xgui4.GUI;

import net.xgui4.Hardware.Component.Power.LithiumBattery;
import net.xgui4.Hardware.ComputerType.Laptop;
import net.xgui4.Player;
import net.xgui4.Software.Firmware.Firmware;
import net.xgui4.Software.Firmware.UEFI;
import net.xgui4.Software.OperatingSystem.OperatingSystem;
import net.xgui4.Software.OperatingSystem.Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PlayButtonAction implements ActionListener {
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Scanner scanner = new Scanner(System.in);

        String username = chooseUsername(scanner);

        int computerType = chooseComputer(scanner);

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

    private static String chooseUsername(Scanner scanner) {
        System.out.print("Enter your username: ");

        return scanner.nextLine();
    }

    private static int chooseComputer(Scanner scanner) {
        System.out.print("Enter your computer type 1 (Laptop), 2 (Desktop : coming soon): ");
        int computerType;

        if (scanner.nextInt() == 1) {
            return scanner.nextInt();
        }
        else {
            System.out.println("Invalid computer type, pls try again.");
            return chooseComputer(scanner);
        }
    }
}

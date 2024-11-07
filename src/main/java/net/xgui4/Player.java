package net.xgui4;

import net.xgui4.Hardware.ComputerType.Computer;

public class Player {
    private String username;
    private Computer computer;

    public Player(String username) {
        this.username = username;
    }

    public void chooseComputer(Computer computer) {
        this.computer = computer;
    }

    public void play() {
        System.out.println("Welcome " + username);
        computer.boot();
    }

    public void analyse() {
        System.out.println("Information : ");
        computer.getInfo(computer.getBattery());
    }

    public void quit() {
        System.out.println("Goodbye " + username);
        computer.shutdown();
    }

    public String getUsername() {
        return username;
    }
}

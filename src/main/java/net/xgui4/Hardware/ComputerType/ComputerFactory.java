package net.xgui4.Hardware.ComputerType;

public class ComputerFactory {
    public Computer createComputer(ComputerType type, String name) {
        switch (type) {
            case LAPTOP -> {
                return new Laptop();
            }
            case DESKTOP -> {
                return new Desktop();
            }
        }

    }
}

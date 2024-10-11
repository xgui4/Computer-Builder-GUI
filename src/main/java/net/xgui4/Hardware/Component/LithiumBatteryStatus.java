package net.xgui4.Hardware.Component;

public enum LithiumBatteryStatus {
    INFLATED("Warning: The battery is inflated!"),
    BAD("Warning: The battery health is bad. You need to change it."),
    GOOD("The battery health is good"),
    NEW("The battery is new");

    private final String message;

    LithiumBatteryStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package net.xgui4.Software.OperatingSystem;

/**
 * Cette classe représente un Système d'exploitation (OS)
 */
public class OperatingSystem {
    private final String name;

    /**
     * Le constructeur d'un sytème d'exploitation
     *
     * @param name : le nom Système d'exploitation
     */
    public OperatingSystem(String name) {
        this.name = name;
    }

    /**
     * Le getter du nom du OS
     *
     * @return
     */
    public String getName() {
        return name;
    }
}

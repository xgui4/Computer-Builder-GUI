package net.xgui4.Software.OperatingSystem;

/**
 * Cette classe représente un Système d'exploitation (OS)
 */
public abstract class OperatingSystem {
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
     * @return le string du nom de l'OS
     */
    public String getName() {
        return name;
    }

    /**
     * Démarre le système d'exploitation
     */
    public abstract void boot();

    /**
     * Éteint le système d'exploitation et la machine
     */
    public abstract void shutdown();
}

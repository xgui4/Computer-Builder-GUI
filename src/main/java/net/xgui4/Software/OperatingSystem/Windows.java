package net.xgui4.Software.OperatingSystem;

/**
 * Cette classe représente le système d'exploitation Windows
 */
public class Windows extends OperatingSystem {

    /**
     * Le constructeur d'un sytème d'exploitation
     *
     * @param name : le nom Système d'exploitation
     */
    public Windows(String name) {
        super(name);
    }

    /**
     * Démarre le système d'exploitation
     */
    @Override
    public void boot() {
        System.out.println("Démarrage de " + getName() + " en cours ...");
    }

    /**
     * Éteint le système d'exploitation et la machine
     */
    @Override
    public void shutdown() {
        System.out.println("Fermeture de " + getName() + " en cours ...");
    }

}

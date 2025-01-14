package net.xgui4.Software.Firmware;

/**
 * La classe abstraite du micrologiciel (Firmware)
 */
public abstract class Firmware {
    private final String name;
    private final String manufacturer;

    /**
     * Le constructeur du micrologiiel
     *
     * @param name         : le nom du micrologiciel
     * @param manufacturer : le nom du manufacturier
     */
    public Firmware(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    /**
     * Le getter du manufacturier
     *
     * @return le manufacturier
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * le getter du nom du micrologiciel
     *
     * @return le nom du micrologiciel
     */
    public String getName() {
        return name;
    }

    /**
     * Afficher l'écran du Power On Self Test (POST)
     */
    public abstract void post();
}

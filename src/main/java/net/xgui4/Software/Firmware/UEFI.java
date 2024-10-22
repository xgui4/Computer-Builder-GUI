package net.xgui4.Software.Firmware;

import net.xgui4.Hardware.Component.TPM;

/**
 * Cette classe représente le Unified Extensible Firmware Interface (UEFI) un type de micrologciel (@interface Firmware)
 */
public class UEFI extends Firmware {
    private final boolean secureBoot;
    private final TPM ftpm = new TPM();

    /**
     * Le constructeur du Unified Extensible Firmware Interface (UEFI)
     *
     * @param name         : le nom du Unified Extensible Firmware Interface
     * @param manufacturer : le manufacturier du Unified Extensible Firmware Interface
     */
    public UEFI(String name, String manufacturer) {
        super(name, manufacturer);
        secureBoot = true;
    }

    /**
     * Afficher l'écran du Power On Self Test (POST)
     */
    @Override
    public void post() {
        if (secureBoot) {
            ftpm.start();
        }
        System.out.println("POST Screen is coming soon!");
    }
}
package net.xgui4.Software.Firmware;

import net.xgui4.Hardware.Component.TPM;

/**
 * Cette classe représente le Unified Extensible Firmware Interface (UEFI) un type de micrologciel (@interface Firmware)
 */
public class UEFI extends Firmware{
    private boolean secureBoot;
    private TPM ftpm = new TPM();
    private SplashScreen postScreen;

    /**
     * Le constructeur du Unified Extensible Firmware Interface (UEFI)
     * @param name : le nom du Unified Extensible Firmware Interface
     * @param postScreen : l'écran du Power On Self Test du Unified Extensible Firmware Interface
     * @param manufacturer : le manufacturier du Unified Extensible Firmware Interface
     */
    public UEFI(String name, SplashScreen postScreen, String manufacturer) {
        super(FirmwareType.UEFI, name, manufacturer);
        secureBoot = true;
        this.postScreen = postScreen;
    }

    /**
     * Afficher l'écran du Power On Self Test (POST)
     */
    @Override
    public void post() {
        if (secureBoot) {
            ftpm.start();
        }
        postScreen.display();
    }
}
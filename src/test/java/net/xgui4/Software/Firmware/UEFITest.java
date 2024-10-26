package net.xgui4.Software.Firmware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UEFITest {
    @Test
    void aUEFIFirmwareMustGiveItNameWhenTheGetterIsUsed() {
        // arrange
        String name = "Dummy Name";
        String dummyManufacturer = "Dummy Manufacturer";
        Firmware UEFI = new UEFI(name, dummyManufacturer);

        // act
        String output =  UEFI.getName();

        // assert
        assertEquals(name, output);
    }

    @Test
    void aUEFIFirmwareMustGiveItManufacturerWhenTheGetterIsUsed() {
        // arrange
        String dummyName = "Dummy Name";
        String manufacturer = "Dummy Manufacturer";
        Firmware UEFI = new UEFI(dummyName, manufacturer);

        // act
        String output =  UEFI.getManufacturer();

        // assert
        assertEquals(manufacturer, output);
    }
}
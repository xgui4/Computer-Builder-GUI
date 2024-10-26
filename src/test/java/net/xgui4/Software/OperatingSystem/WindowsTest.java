package net.xgui4.Software.OperatingSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowsTest {
    @Test
    void aWindowsOSMustGiveItValidNameWithItGetter() {
        // arrange
        String name = "Windows Dummy";
        OperatingSystem windows = new Windows(name);

        // act
        String output = windows.getName();

        // assert
        assertEquals(name, output);
    }
}
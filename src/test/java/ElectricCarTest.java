import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricCarTest {
    ElectricCar electricCar;

    @BeforeEach
    void setUp() {
        electricCar = new ElectricCar();
    }

    @Test
    void shouldStartElectricCar() {
        assertEquals("Starting electric car", electricCar.start());
    }

    @Test
    void shouldStopElectricCar() {
        assertEquals("Stopping electric car", electricCar.stop());
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricCarFactoryTest {
    ElectricCarFactory electricCarFactory;

    @BeforeEach
    void setUp() {
        electricCarFactory = new ElectricCarFactory();
    }

    @Test
    void shouldCreateElectricCar() {
        Car car = electricCarFactory.createCar();
        assertTrue(car instanceof ElectricCar);
    }
}
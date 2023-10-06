import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombustionCarFactoryTest {

    CombustionCarFactory combustionCarFactory;

    @BeforeEach
    void setUp() {
        combustionCarFactory = new CombustionCarFactory();
    }

    @Test
    void shouldCreateCar() {
        Car car = combustionCarFactory.createCar();
        assertEquals(CombustionCar.class, car.getClass());
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombustionCarTest {

    CombustionCar combustionCar;

    @BeforeEach
    void setUp() {
        combustionCar = new CombustionCar();
    }

    @Test
    void start() {
        assertEquals("Starting combustion car", combustionCar.start());
    }

    @Test
    void stop() {
        assertEquals("Stopping combustion car", combustionCar.stop());
    }
}
package airport;

import org.junit.jupiter.api.Test;
import plane.Plane;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @Test
    void landPlane() {
        // Plane can be landed at airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Heathrow.landPlane(plane);
        assertEquals(plane, Heathrow.landedPlanes.get(0));
    }
}
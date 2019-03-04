package airport;

import org.junit.jupiter.api.Test;
import plane.Plane;

import static org.junit.jupiter.api.Assertions.*;

class AirportLandPlaneTest {

    @Test
    void landPlane() {
        // Plane can be landed at airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Heathrow.land(plane);
        assertEquals(plane, Heathrow.landedPlanes.get(0));
    }
}
package airport;

import org.junit.jupiter.api.Test;
import plane.Plane;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AirportDepartTest {

    @Test
    void depart() {
        // Plane can be departed from airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Heathrow.land(plane);
        Heathrow.depart(plane);
        assertFalse(Heathrow.landedPlanes.contains(plane));
    }
}
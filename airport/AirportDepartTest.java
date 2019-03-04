package airport;

import org.junit.jupiter.api.Test;
import plane.Plane;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AirportDepartTest {

    @Test
    void depart() {
        // Plane can be departed from airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Plane concorde = new Plane();
        Heathrow.land(plane);
        Heathrow.land(concorde);
        Heathrow.depart(plane);
        assertNotEquals(plane, Heathrow.landedPlanes.get(0));
    }
}
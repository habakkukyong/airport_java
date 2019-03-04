package plane;

import airport.Airport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PlaneDepartTest {

    @Test
    void depart() {
        // Plane can be instructed to take off from airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        plane.land(Heathrow);
        plane.depart(Heathrow);
        assertFalse(Heathrow.landedPlanes.contains(plane));
    }
}
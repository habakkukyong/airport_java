package plane;

import airport.Airport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PlaneDepartTest {

    @Test
    void depart() {
        // Plane can be instructed to take off from airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Plane concorde = new Plane();
        plane.land(Heathrow);
        concorde.land(Heathrow);
        plane.depart(Heathrow);
        assertNotEquals(plane, Heathrow.landedPlanes.get(0));
    }
}
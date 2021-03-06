package plane;

import airport.Airport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneLandTest {

    @Test
    void land() {
        // Plane can be instructed to land at airport
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        plane.land(Heathrow);
        assertTrue(Heathrow.landedPlanes.contains(plane));
    }
}
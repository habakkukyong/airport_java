package airport;

import org.junit.jupiter.api.Test;
import plane.Plane;

import static org.junit.jupiter.api.Assertions.*;

class AirportConfirmDepartureTest {

    @Test
    void confirmDeparture() {
        // Departure confirmation is false when plane is landed and true when departed
        Airport Heathrow = new Airport();
        Plane plane = new Plane();
        Heathrow.land(plane);
        assertFalse(Heathrow.confirmDeparture(plane));
        Heathrow.depart(plane);
        assertTrue(Heathrow.confirmDeparture(plane));
    }
}
package plane;

import airport.Airport;

public class Plane {
    public void land(Airport airport) {
        airport.landPlane(this);
    }
}

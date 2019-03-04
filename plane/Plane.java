package plane;

import airport.Airport;

public class Plane {
    public void land(Airport airport) { airport.land(this); }

    public void depart(Airport airport) { airport.depart(this); }
}

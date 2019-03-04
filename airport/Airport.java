package airport;

import plane.Plane;

import java.util.ArrayList;

public class Airport {
    public ArrayList<Plane> landedPlanes = new ArrayList<>();

    public void land(Plane plane) { landedPlanes.add(plane); }

    public void depart(Plane plane) { landedPlanes.remove(plane); }
}

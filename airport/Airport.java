package airport;

import plane.Plane;

import java.util.ArrayList;

public class Airport {
    public ArrayList<Plane> landedPlanes = new ArrayList<>();

    public void landPlane(Plane plane) {
        landedPlanes.add(plane);
    }
}

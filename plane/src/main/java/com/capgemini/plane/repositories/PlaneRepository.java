package com.capgemini.plane.repositories;

import com.capgemini.plane.models.Plane;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlaneRepository implements IPlaneRepository {

    private List<Plane> planes;

    public PlaneRepository() {
        this.planes = new ArrayList<>();
        this.planes.add(new Plane("Airbus A300 AA1 ","Captain Jan de Vries"));
        this.planes.add(new Plane("Boeing 747 AA2","Captain Bas de Hoop"));
    }

    @Override
    public List<Plane> getPlanes() {
        return this.planes;
    }

    @Override
    public Plane savePlane(Plane plane) {
        this.planes.add(plane);
        return plane;
    }
}

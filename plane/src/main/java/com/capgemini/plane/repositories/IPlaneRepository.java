package com.capgemini.plane.repositories;

import com.capgemini.plane.models.Plane;

import java.util.List;

public interface IPlaneRepository {

    List<Plane> getPlanes();
    Plane savePlane(Plane plane);
}

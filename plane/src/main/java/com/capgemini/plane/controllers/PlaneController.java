package com.capgemini.plane.controllers;

import com.capgemini.plane.models.Plane;
import com.capgemini.plane.repositories.IPlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/planes/")
public class PlaneController {

    @Autowired
    private IPlaneRepository planeRepository;

    @GetMapping("single")
    public Plane getSinglePlane() {
        Plane plane = new Plane("Airbus A300 AA1 ", "Captain Jan de Vries");
        return plane;
    }

    @GetMapping("all")
    public List<Plane> getAllPlanes() {
        return this.planeRepository.getPlanes();
    }

    @PostMapping("new")
    public void createPlane(@RequestBody Plane newPlane) {
        this.planeRepository.savePlane(newPlane);
    }
}
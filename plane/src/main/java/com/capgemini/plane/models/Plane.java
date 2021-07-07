package com.capgemini.plane.models;


public class Plane<String> {

    private String name;
    private String captain;

    public Plane() {

    }

    public Plane(String name, String captain) {
        this.name = name;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
}

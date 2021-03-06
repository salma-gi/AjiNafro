package com.example.ajinafro.utils;

import java.io.Serializable;

public class LatLon implements Serializable {
    private double lon;
    private double lat;

    public LatLon(double lat, double lon) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "LatLon{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}

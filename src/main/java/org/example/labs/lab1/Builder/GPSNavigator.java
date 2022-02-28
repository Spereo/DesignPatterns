package org.example.labs.lab1.Builder;

public class GPSNavigator {
    private String route;

    public GPSNavigator() { this.route = "Dare to dream"; }

    public GPSNavigator(String manualRoute) { this.route = manualRoute; }

    public String getRoute() { return route; }
}

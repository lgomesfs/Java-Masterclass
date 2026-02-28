package dev.lpa;

public class Town {
    private String townName;
    private int distanceFromSidney;

    public Town(String townName, int distanceFromSidney) {
        this.townName = townName;
        this.distanceFromSidney = distanceFromSidney;
    }

    public String getTownName() {
        return townName;
    }

    public int getDistanceFromSidney() {
        return distanceFromSidney;
    }

}

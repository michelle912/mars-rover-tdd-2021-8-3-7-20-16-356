package com.afs.tdd;

public class MarsRover {

    private String direction;
    private Integer locationX;
    private Integer locationY;

    public MarsRover() {
        this.direction = "N"; //TODO: enum
        this.locationX = 0;
        this.locationY = 0;
    }

    public MarsRover(Integer locationX, Integer locationY, String direction) {
        this.direction = direction;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public String getReport() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }

    protected void move() {
        switch (direction) {
            case "N":
                locationY++;
                break;
            case "E":
                locationX++;
                break;
            case "S":
                locationY--;
                break;
            case "W":
                locationX--;
                break;
        }
    }

    protected void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    protected void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }
}

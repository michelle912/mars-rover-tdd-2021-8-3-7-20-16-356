package com.afs.tdd;

public class MarsRover {

    private String direction;
    private Integer locationX;
    private Integer locationY;

    public enum Commands {
        M, L, R;
    }

    public MarsRover() {
        this.direction = "N";
        this.locationX = 0;
        this.locationY = 0;
    }

    public MarsRover(Integer locationX, Integer locationY, String direction) {
        this.direction = direction;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public void executeCommand(String command) {
        if (Commands.M.name().equals(command)) {
            this.move();
        }
    }

    public String getReport() {
        return String.format("%d %d %s", locationX, locationY, direction);
    }

    private void move() {
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
        }
    }
}

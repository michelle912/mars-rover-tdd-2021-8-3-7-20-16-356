package com.afs.tdd;

public class MoveCommand implements Command {
    private MarsRover marsRover;

    public MoveCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.move();
    }
}

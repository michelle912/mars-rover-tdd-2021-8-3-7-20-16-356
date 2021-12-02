package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    private static final String MOVE = "M";

    // move
    @Test
    public void should_move_towards_north_when_executeCommand_given_command_is_M_and_direction_is_N() {
        // given

        // when
        MarsRover marsRover = new MarsRover();
        marsRover.move();
        String result = marsRover.getReport();

        // then
        assertEquals("0 1 N", result);
    }


}
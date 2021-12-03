package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    private static final String MOVE = "M";
    private static final String TURNLEFT = "L";
    private static final String TURNRIGHT = "R";

    private MarsRoverController marsRoverController;
    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRoverController = new MarsRoverController();
        marsRover = new MarsRover();
    }

    // move
    @Test
    public void should_move_towards_north_when_executeCommand_given_command_is_M_and_direction_is_N() {
        // given


        // when
        marsRoverController.executeCommand(MOVE, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 1 N", result);
    }

    @Test
    public void should_move_towards_east_when_executeCommand_given_command_is_M_and_direction_is_E() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "E");

        // when
        marsRoverController.executeCommand(MOVE, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("1 0 E", result);
    }

    @Test
    public void should_move_towards_south_when_executeCommand_given_command_is_M_and_direction_is_S() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "S");

        // when
        marsRoverController.executeCommand(MOVE, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 -1 S", result);
    }

    @Test
    public void should_move_towards_west_when_executeCommand_given_command_is_M_and_direction_is_W() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "W");

        // when
        marsRoverController.executeCommand(MOVE, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("-1 0 W", result);
    }

    @Test
    public void should_turn_to_west_when_executeCommand_given_command_is_L_and_direction_is_N() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "N");

        // when
        marsRoverController.executeCommand(TURNLEFT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 W", result);
    }

    @Test
    public void should_turn_to_south_when_executeCommand_given_command_is_L_and_direction_is_W() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "W");

        // when
        marsRoverController.executeCommand(TURNLEFT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 S", result);
    }


    @Test
    public void should_turn_to_east_when_executeCommand_given_command_is_L_and_direction_is_S() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "S");

        // when
        marsRoverController.executeCommand(TURNLEFT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 E", result);
    }


    @Test
    public void should_turn_to_north_when_executeCommand_given_command_is_L_and_direction_is_E() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "E");

        // when
        marsRoverController.executeCommand(TURNLEFT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 N", result);
    }


    @Test
    public void should_turn_to_east_when_executeCommand_given_command_is_R_and_direction_is_N() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "N");

        // when
        marsRoverController.executeCommand(TURNRIGHT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 E", result);
    }

    @Test
    public void should_turn_to_south_when_executeCommand_given_command_is_R_and_direction_is_E() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "E");

        // when
        marsRoverController.executeCommand(TURNRIGHT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 S", result);
    }

    @Test
    public void should_turn_to_west_when_executeCommand_given_command_is_R_and_direction_is_S() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "S");

        // when
        marsRoverController.executeCommand(TURNRIGHT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 W", result);
    }

    @Test
    public void should_turn_to_north_when_executeCommand_given_command_is_R_and_direction_is_W() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "W");

        // when
        marsRoverController.executeCommand(TURNRIGHT, marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("0 0 N", result);
    }

    @Test
    public void should_move_north_and_turn_left_and_move_west_and_turn_right_when_executeCommands_given_command_is_MLMR_and_direction_is_N() {
        // given
        MarsRover marsRover = new MarsRover(0,0, "N");

        // when
        marsRoverController.executeCommands("MLMR", marsRover);
        String result = marsRover.getReport();

        // then
        assertEquals("-1 1 N", result);
    }
}
package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRoverController {

    public enum Commands {
        M, L, R;
    }

    public void executeCommands(String commands, MarsRover marsRover) {
        List<String> commandList = Arrays.asList(commands.split(""));

        commandList.forEach(e -> executeCommand(e, marsRover));
    }

    public void executeCommand(String command, MarsRover marsRover) {
        Command parsedCommand = parseCommand(command, marsRover);
        if (parsedCommand == null) {
            return;
        }
        parsedCommand.execute();
    }

    public Command parseCommand(String command, MarsRover marsRover) {
        if (Commands.M.name().equals(command)) {
            return new MoveCommand(marsRover);
        } else if (Commands.L.name().equals(command)) {
            return new TurnLeftCommand(marsRover);
        } else if (Commands.R.name().equals(command)) {
            return new TurnRightCommand(marsRover);
        }
        return null;
    }

}

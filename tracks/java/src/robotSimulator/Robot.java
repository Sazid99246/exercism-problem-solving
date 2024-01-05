package robotSimulator;

/**
 * The Robot class represents a robot in a grid-based environment.
 * It maintains the robot's position and orientation within the grid and
 * provides functionality
 * to manipulate its state based on commands.
 */

public class Robot {

    /**
     * The current position of the robot on the grid.
     */
    private GridPosition position;

    /**
     * The current orientation of the robot.
     */
    private Orientation orientation;

    /**
     * Constructs a new Robot with the specified initial position and orientation.
     *
     * @param initialPosition    The starting position of the robot on the grid.
     * @param initialOrientation The initial orientation of the robot.
     */
    Robot(GridPosition initialPosition, Orientation initialOrientation) {
        this.position = initialPosition;
        this.orientation = initialOrientation;
    }

    /**
     * Retrieves the current grid position of the robot.
     *
     * @return The current position of the robot.
     */
    GridPosition getGridPosition() {
        return this.position;
    }

    /**
     * Retrieves the current orientation of the robot.
     *
     * @return The current orientation of the robot.
     */
    Orientation getOrientation() {
        return this.orientation;
    }

    /**
     * Advances the robot one grid space in its current orientation.
     */
    void advance() {
        switch (orientation) {
            case NORTH:
                position = new GridPosition(position.x, position.y + 1);
                break;
            case EAST:
                position = new GridPosition(position.x + 1, position.y);
                break;
            case SOUTH:
                position = new GridPosition(position.x, position.y - 1);
                break;
            case WEST:
                position = new GridPosition(position.x - 1, position.y);
                break;
        }
    }

    /**
     * Turns the robot to its left based on its current orientation.
     */
    void turnLeft() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.WEST;
                break;

            case WEST:
                orientation = Orientation.SOUTH;
                break;

            case SOUTH:
                orientation = Orientation.EAST;
                break;

            case EAST:
                orientation = Orientation.NORTH;
                break;

        }
    }

    /**
     * Turns the robot to its right based on its current orientation.
     */
    void turnRight() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.EAST;
                break;

            case EAST:
                orientation = Orientation.SOUTH;
                break;

            case SOUTH:
                orientation = Orientation.WEST;
                break;

            case WEST:
                orientation = Orientation.NORTH;
                break;
        }
    }

    /**
     * Simulates the robot's movement based on a string of instructions.
     * Each character in the instructions string represents a command: 'L' for turn
     * left,
     * 'R' for turn right, and 'A' for advance. Throws IllegalArgumentException on
     * invalid instruction.
     *
     * @param instructions A string containing a series of movement instructions.
     * @throws IllegalArgumentException If the instructions contain an invalid
     *                                  command.
     */
    void simulate(String instructions) {
        char[] instructionArr = instructions.toCharArray();

        for (char instruction : instructionArr) {
            switch (instruction) {
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'A':
                    advance();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid instruction");
            }
        }
    }

}
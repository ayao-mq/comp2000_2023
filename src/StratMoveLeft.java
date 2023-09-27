import java.util.List;

// Odd row = move to the leftmost position
public class StratMoveLeft implements MovementStrategy {

    @Override
    public void moveBot(Actor a, List<Cell> possibleLocs) {
        if (possibleLocs.isEmpty()) {
            return; // No valid locations to move to
        }

        Cell leftMostCell = null;

        // Find the leftmost cell
        for (Cell cell : possibleLocs) {
            if (leftMostCell == null || cell.col < leftMostCell.col) {
                leftMostCell = cell;
            }
        }

        // Move to the leftmost cell
        if (leftMostCell != null) {
            a.setLocation(leftMostCell);
        }
    }
}


import java.util.List;
import java.util.Random;

// Even Row = random movement within possibleLocations
public class StratMoveRandom implements MovementStrategy {

    @Override
    public void moveBot(Actor a, List<Cell> possibleLocs) {
        if (possibleLocs.isEmpty()) {
            return; // No valid locations to move to
        }

        int moveBotChooses = (new Random()).nextInt(possibleLocs.size());
        a.setLocation(possibleLocs.get(moveBotChooses));
    }
}
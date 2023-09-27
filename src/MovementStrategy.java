import java.util.List;

public interface MovementStrategy {
    void moveBot(Actor a, List<Cell> possibleLocs);
}
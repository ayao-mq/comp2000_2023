import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor {
    private Motif motif;
    Float phase;

    public Horse(Cell inLoc, Color inColor, Boolean isHuman, int inMoves, Motif motif) {
        super(inLoc, inColor, isHuman, inMoves);
        this.motif = motif;
    }

    public void setPoly() {
      phase = AnimationBeat.getInstance().phaseCompletion() / 100.0f;
    }

    public void paint(Graphics g) {
      phase = AnimationBeat.getInstance().phaseCompletion() / 100.0f;
      motif.draw(g, loc.x, loc.y, color);
    }
}

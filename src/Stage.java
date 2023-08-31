import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }
    
    //display cell position
    // if (mouseLoc != null) {
    //   grid.paintCellPosition(g, mouseLoc);
    // }

  Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if (underMouse.isPresent()){
      Cell hoverCell = underMouse.get();
      g.setColor(Color.RED);
      Font f = new Font(Font.SANS_SERIF, Font.BOLD, 30);
      g.setFont(f);
      g.drawString("Position: " + hoverCell.col + "" + hoverCell.row, 770, 360);
    }
  }
}

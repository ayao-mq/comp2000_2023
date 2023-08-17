import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Stage {
  Grid grid;
  // Actor cat;
  // Actor dog;
  // Actor bird;
  private List<Actor> actors = new ArrayList<>();


  public Stage() {
    grid = new Grid();
    // cat = new Cat(grid.cellAtColRow(0, 0));
    // dog = new Dog(grid.cellAtColRow(0, 15));
    // bird = new Bird(grid.cellAtColRow(12, 9));
    actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
    actors.add(new Butterfly(grid.cellAtColRow(10, 0)));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    // cat.paint(g);
    // dog.paint(g);
    // bird.paint(g);
    for (Actor actor : actors) {
      actor.paint(g); 
    }
  }
}

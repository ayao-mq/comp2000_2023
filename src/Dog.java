import java.awt.Polygon;
import java.util.ArrayList;
import java.awt.Color;

public class Dog extends Actor {
  public Dog(Cell inLoc) {
    loc = inLoc;
    polygons = new ArrayList<>();
    
    Polygon ear1 = new Polygon();
    ear1.addPoint(loc.x + 5, loc.y + 5);
    ear1.addPoint(loc.x + 15, loc.y + 5);
    ear1.addPoint(loc.x + 5, loc.y + 15);
    Polygon ear2 = new Polygon();
    ear2.addPoint(loc.x + 20, loc.y + 5);
    ear2.addPoint(loc.x + 30, loc.y + 5);
    ear2.addPoint(loc.x + 30, loc.y + 15);
    Polygon face = new Polygon();
    face.addPoint(loc.x + 8, loc.y + 7);
    face.addPoint(loc.x + 27, loc.y + 7);
    face.addPoint(loc.x + 27, loc.y + 25);
    face.addPoint(loc.x + 8, loc.y + 25);
    
    polygons.add(ear1);
    polygons.add(ear2);
    polygons.add(face);

    color = Color.YELLOW;
  }
}

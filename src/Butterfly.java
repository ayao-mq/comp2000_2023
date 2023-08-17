import java.awt.Polygon;
import java.util.ArrayList;
import java.awt.Color;

public class Butterfly extends Actor {
  public Butterfly(Cell inLoc) {
    loc = inLoc;
    polygons = new ArrayList<>();
    
    Polygon leftWing1 = new Polygon();
    leftWing1.addPoint(loc.x + 5, loc.y + 7);
    leftWing1.addPoint(loc.x + 14, loc.y + 16);
    leftWing1.addPoint(loc.x + 5, loc.y + 15);

    Polygon leftWing2 = new Polygon();
    leftWing2.addPoint(loc.x + 4, loc.y + 20);
    leftWing2.addPoint(loc.x + 14, loc.y + 19);
    leftWing2.addPoint(loc.x + 4, loc.y + 32);

    Polygon rightWing1 = new Polygon();
    rightWing1.addPoint(loc.x + 31, loc.y + 7);
    rightWing1.addPoint(loc.x + 21, loc.y + 16);
    rightWing1.addPoint(loc.x + 30, loc.y + 15);

    Polygon rightWing2 = new Polygon();
    rightWing2.addPoint(loc.x + 21, loc.y + 19);
    rightWing2.addPoint(loc.x + 31, loc.y + 20);
    rightWing2.addPoint(loc.x + 31, loc.y + 32);

    Polygon body = new Polygon();
    body.addPoint(loc.x + 15, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 25);
    body.addPoint(loc.x + 15, loc.y + 25);

    polygons.add(leftWing1);
    polygons.add(leftWing2);
    polygons.add(rightWing1);
    polygons.add(rightWing2);
    polygons.add(body);

    color = Color.MAGENTA;
  }
}

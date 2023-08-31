import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.function.Consumer;

public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(colToLabel(i), j, 10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }

  private char colToLabel(int col) {
    return (char) (col + Character.valueOf('A'));
  }

  private int labelToCol(char col) {
    return (int) (col - Character.valueOf('A'));
  }

  public void paint(Graphics g, Point mousePos) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }

  public void doToEachCell(Consumer<Cell> func) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        func.accept(cells[i][j]);
      }
    }
  }

  // return (cells[c][r]);
  public Optional<Cell> cellAtColRow(int c, int r) {
    if (c >= 0 && c < cells.length && r >= 0 && r < cells[0].length) {
        return Optional.of(cells[c][r]);
    } else {
        return Optional.empty();
    }
  }

  public Optional<Cell> cellAtColRow(char c, int r) {
    return (cellAtColRow(labelToCol(c), r));
  }

  // Task 12 cellAtPoint(Point p)
  public Optional<Cell> cellAtPoint(Point p){
    for(int i = 0; i < cells.length; i++){
      for(int j = 0; j < cells[i].length; j++){
        if(cells[i][j].contains(p)){
          return Optional.of(cells[i][j]);
        }
      }
    }
    return Optional.empty();
  }

  // public String getCellPosition(Point mousePos) {
  //   // isPresent condition necessary for space within canvas, outside grid
  //   if (cellAtPoint(mousePos).isPresent()) {
  //     Cell currentCell = cellAtPoint(mousePos).get();
  //     return "Position: " + currentCell.col + "" + currentCell.row;
  //   }
  //   return "";
  // }

  // public void paintCellPosition(Graphics g, Point mousePos) {
  //     String cellPosition = getCellPosition(mousePos);
  //     g.setColor(Color.RED);
  //     Font f = new Font(Font.SANS_SERIF, Font.BOLD, 30);
  //     g.setFont(f);
  //     g.drawString(cellPosition, 770, 360);
  // }
}

import java.util.Iterator;

public class GridIterator implements Iterator<Cell> {
    private Cell[][] cells;
    private int rowIndex;
    private int colIndex;
    boolean runOut;

    public GridIterator(Cell[][] cells) {
        this.cells = cells;
        rowIndex = 0;
        colIndex = 0;
        runOut = false;
    }

    @Override
    public boolean hasNext() {
        // return rowIndex < cells.length && colIndex < cells[0].length;
        return runOut;
    }

    @Override
    public Cell next() {
        Cell c = cells[rowIndex][colIndex];

        colIndex++;
        if (colIndex >= cells[0].length) {
            colIndex = 0;
            rowIndex++;
            if(rowIndex >= cells.length) {
                runOut = true;
            }
        }

        return c;
    }
}

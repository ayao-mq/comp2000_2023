import java.util.Iterator;

public class GridIterator implements Iterator<Cell> {
    private Cell[][] cells;
    private int rowIndex;
    private int colIndex;

    public GridIterator(Cell[][] cells) {
        this.cells = cells;
        rowIndex = 0;
        colIndex = 0;
    }

    @Override
    public Cell next() {
        Cell cell = cells[rowIndex][colIndex];

        colIndex++;
        if (colIndex >= cells[0].length) {
            colIndex = 0;
            rowIndex++;
        }

        return cell;
    }

    @Override
    public boolean hasNext() {
        return rowIndex < cells.length && colIndex < cells[0].length;
    }
}

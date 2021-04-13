package trycatchfinally;

abstract class PreMatrix {
    private int row;
    private int column;
    private int[][] matrix =new int[row][column];

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    abstract void insertMatrix();
    abstract void searchThroughElement();
    abstract void searchThroughPosition();
}

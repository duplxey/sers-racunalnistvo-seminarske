package com.yourname.projectname.letnik_3.prison;

import com.yourname.projectname.letnik_3.prison.cell.Cell;

import java.util.LinkedList;

public class Block {

    private char blockChar;
    private LinkedList<Cell> cells = new LinkedList<>();

    public Block(char blockChar) {
        this.blockChar = blockChar;
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public char getBlockChar() {
        return blockChar;
    }

    public Cell getCell(int index) {
        return cells.get(index);
    }

    public LinkedList<Cell> getCells() {
        return cells;
    }
}

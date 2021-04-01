package com.jrda.kata_log.game_of_life;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameOfLife {
    private Cell[][] grid;

    public GameOfLife(int size, double percentageOfLive) {
        //adding two, we can move around cells without going out of bounds
        grid = new Cell[size + 2][size + 2];
        initGrid(percentageOfLive);
        loadNeighbors();
    }

    public void tick() {
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                grid[i][j].check();
            }
        }
    }

    private void loadNeighbors() {
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                loadNeighbors(i, j);
            }
        }
    }

    private void loadNeighbors(int i, int j) {
        List<Cell> neighbors = new ArrayList<>();

        tryToLoadCellIntoNeighbor(i - 1, j - 1, neighbors);
        tryToLoadCellIntoNeighbor(i - 1, j, neighbors);
        tryToLoadCellIntoNeighbor(i - 1, j + 1, neighbors);
        tryToLoadCellIntoNeighbor(i, j - 1, neighbors);
        tryToLoadCellIntoNeighbor(i, j + 1, neighbors);
        tryToLoadCellIntoNeighbor(i + 1, j - 1, neighbors);
        tryToLoadCellIntoNeighbor(i + 1, j, neighbors);
        tryToLoadCellIntoNeighbor(i + 1, j + 1, neighbors);

        grid[i][j].setNeighbors(neighbors);
    }

    private void tryToLoadCellIntoNeighbor(int i, int j, List<Cell> neighbors) {
        Cell cell = grid[i][j];
        if (cell != null)
            neighbors.add(cell);
    }

    private void initGrid(double percentageOfLive) {
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                grid[i][j] = generateCell(percentageOfLive);
            }
        }
    }

    private Cell generateCell(double percentageOfLive) {
        Random random = new Random();

        if (random.nextDouble() <= percentageOfLive)
            return generateLiveCell();
        else
            return generateDedCell();
    }

    private Cell generateLiveCell() {
        Cell cell = new Cell();
        cell.setState(new LiveState(cell));
        return cell;
    }

    private Cell generateDedCell() {
        Cell cell = new Cell();
        cell.setState(new DeadState(cell));
        return cell;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j].isAlive())
                    stringBuilder.append("O");
                else
                    stringBuilder.append("X");
            }
            stringBuilder.append(System.getProperty("line.separator"));
        }

        return stringBuilder.toString();
    }
}

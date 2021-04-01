package com.jrda.kata_log.game_of_life;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {
    private Cell cell;

    @Before
    public void init() {
        cell = new Cell();
    }

    @Test
    public void testDeadByLessThanTwo() {
        cell.setState(new LiveState(cell));
        cell.setNeighbors(generateNeighbors(3, new DeadState(null)));
        cell.check();
        assertFalse(cell.isAlive());
    }

    @Test
    public void testKeepAlive2() {
        cell.setState(new LiveState(cell));
        cell.setNeighbors(generateNeighbors(2, new LiveState(null)));
        cell.check();
        assertTrue(cell.isAlive());
    }

    @Test
    public void testKeepAlive3() {
        cell.setState(new LiveState(cell));
        cell.setNeighbors(generateNeighbors(3, new LiveState(null)));
        cell.check();
        assertTrue(cell.isAlive());
    }

    @Test
    public void testDeadByMoreThan3() {
        cell.setState(new LiveState(cell));
        cell.setNeighbors(generateNeighbors(4, new LiveState(null)));
        cell.check();
        assertFalse(cell.isAlive());
    }

    @Test
    public void testBecomingAlive() {
        cell.setState(new DeadState(cell));
        cell.setNeighbors(generateNeighbors(3, new LiveState(null)));
        cell.check();
        assertTrue(cell.isAlive());
    }

    private List<Cell> generateNeighbors(int n, State state) {
        List<Cell> neighbors = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Cell cell = new Cell();
            cell.setState(state);
            neighbors.add(cell);
        }

        return neighbors;
    }
}
package com.jrda.algorithms.two_nums_add_up_to_k;

import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddUpToKTest {
    @Test
    public void testAddUpToK() {
        AddUpToK addUpToK = new AddUpToK();
        assertEquals(new Pair<>(4, 3), addUpToK.findAddUptoK(new Integer[]{1, 2, 3, 4}, 7));
        assertEquals(new Pair<>(4, 3), addUpToK.findAddUptoK(new Integer[]{1, 3, 2, 4}, 7));
        assertEquals(new Pair<>(7, 10), addUpToK.findAddUptoK(new Integer[]{10, 15, 3, 7}, 17));
    }
}
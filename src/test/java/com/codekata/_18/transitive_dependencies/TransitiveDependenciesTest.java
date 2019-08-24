package com.codekata._18.transitive_dependencies;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;


public class TransitiveDependenciesTest {

    @Test
    public void testOneDependency(){
        TransitiveDependencies transitiveDependencies = new TransitiveDependencies();
        transitiveDependencies.addDirect("c", new String[] {"g"});
        assertEquals(new HashSet<>(Arrays.asList("g")), transitiveDependencies.getDependencies("c"));
    }

    @Test
    public void testTwoDependencies(){
        TransitiveDependencies transitiveDependencies = new TransitiveDependencies();
        transitiveDependencies.addDirect("e", new String[] {"f"});
        transitiveDependencies.addDirect("f", new String[] {"h"});
        transitiveDependencies.addDirect("h", new String[] {"e"});
        assertEquals(new HashSet<>(Arrays.asList("f", "h", "e")) , transitiveDependencies.getDependencies("e"));
    }
}

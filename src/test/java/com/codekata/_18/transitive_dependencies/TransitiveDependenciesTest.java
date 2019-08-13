package com.codekata._18.transitive_dependencies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TransitiveDependenciesTest {

    @Test
    public void testOneDependency(){
        TransitiveDependencies transitiveDependencies = new TransitiveDependencies();
        transitiveDependencies.addDirect("c", new String[] {"g"});
        assertEquals(new String[] {"g"}, transitiveDependencies.getDependencies("c"));
    }

    @Test
    public void testTwoDependencies(){
        TransitiveDependencies transitiveDependencies = new TransitiveDependencies();
        transitiveDependencies.addDirect("e", new String[] {"f"});
        transitiveDependencies.addDirect("f", new String[] {"h"});
        assertEquals(new String[] {"f", "h"}, transitiveDependencies.getDependencies("e"));
    }
}

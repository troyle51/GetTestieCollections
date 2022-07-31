package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    @Test
    public void testTreeSet(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        Assert.assertEquals(3, treeSet.size());
    }
}

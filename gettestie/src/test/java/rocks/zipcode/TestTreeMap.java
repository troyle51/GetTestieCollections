package rocks.zipcode;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;

public class TestTreeMap {
    @Test
    public void testTreeSet(){
        TreeMap<Integer, Integer> treeSet = new TreeMap<>();
        treeSet.put(1, 1);
        treeSet.put(2, 2);
        treeSet.put(3, 3);

        Assert.assertEquals(3, treeSet.size());
    }

    @Test
    public void testTreeSet2(){
        TreeMap<Integer, Integer> treeSet = new TreeMap<>();
        treeSet.put(1, 1);
        treeSet.put(2, 2);
        treeSet.put(3, 3);

        Assert.assertEquals(true, treeSet.containsKey(1));
    }
}

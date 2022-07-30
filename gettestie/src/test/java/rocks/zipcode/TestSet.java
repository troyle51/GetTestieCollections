package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    Set<String> set;

    @Before
    public void init() {
        set = new HashSet<>();
    }

    @Test
    public void testSet1(){
        set.add("add set");
        Assert.assertEquals(false, set.isEmpty());
    }
    @Test
    public void testSet2(){
        Assert.assertEquals(true, set.isEmpty());
    }

    @Test
    public void testSet3(){
        set.add("add set");
        Assert.assertEquals(true, set.remove("add set"));
        System.out.println();
    }



}

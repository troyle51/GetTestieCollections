package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestList {
    ArrayList<String> list;


    @Before
    public void init() {
        list = new ArrayList<>();
    }

    @Test
    public void testEmpty(){
        list.add("Hello");
        Assert.assertEquals(false, list.isEmpty());
    }

    @Test
    public void testAdd(){
        list.add("Hello");
        Assert.assertEquals("Hello", list.get(0));
    }

    @Test
    public void testGetSize(){
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");

        Assert.assertEquals(4, list.size());
    }

    @Test
    public void testRemove(){
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");

        Assert.assertEquals("Hello2", list.remove(1));
    }


}

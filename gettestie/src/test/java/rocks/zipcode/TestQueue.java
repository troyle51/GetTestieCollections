package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TestQueue {
    LinkedList<String> list;

    @Before
    public void init(){
        list = new LinkedList<>();
    }

    @Test
    public void addTest(){
        list.add("Hi");

        Assert.assertEquals(false, list.isEmpty());
    }
    @Test
    public void addTest2(){
        list.add("Hi");

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void remove(){
        list.add("hi");
        list.remove(0);

        Assert.assertEquals(true, list.isEmpty());
    }


}

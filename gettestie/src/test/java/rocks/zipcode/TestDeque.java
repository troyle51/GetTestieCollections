package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestDeque {
    ArrayDeque<Integer> list;

    @Test
    public void addTest(){
        list= new ArrayDeque<>();
        list.add(1);

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testPush(){
        list= new ArrayDeque<>();
        list.add(1);
        list.push(1);

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testRemove(){
        list= new ArrayDeque<>();
        list.add(1);
        list.push(1);
        list.remove(1);

        Assert.assertEquals(1, list.size());
    }


}

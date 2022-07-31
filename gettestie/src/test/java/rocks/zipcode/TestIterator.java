package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestIterator {
    @Test
    public void testIterator(){
        ArrayList<String> list = new ArrayList<>();

        Assert.assertEquals(false,list.iterator().hasNext());
    }

    @Test
    public void testIterator2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        Assert.assertEquals(true,list.iterator().hasNext());
    }

    @Test
    public void testIterator3(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        Assert.assertEquals("Hello",list.iterator().next());
    }


}

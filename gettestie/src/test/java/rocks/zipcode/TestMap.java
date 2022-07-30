package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    Map<Integer, Integer> hashMap;

    @Before
    public void init(){
        hashMap = new HashMap<>();
    }

    @Test
    public void testAdd(){
        hashMap.put(1,1);
        int expected = hashMap.get(1);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEmpty(){
        Assert.assertEquals(true, hashMap.isEmpty());
    }

    @Test
    public void testRemove(){
        hashMap.put(1,1);
        hashMap.put(2,1);
        hashMap.put(3,1);
        hashMap.put(4,1);

        hashMap.remove(2);
        Assert.assertEquals(3, hashMap.size());
    }


}

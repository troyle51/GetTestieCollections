package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void testComparable(){
        Integer i = 1;
        Integer j = 1;

        Integer actual = j.compareTo(i);
        Assert.assertTrue(actual > -1);
    }
}

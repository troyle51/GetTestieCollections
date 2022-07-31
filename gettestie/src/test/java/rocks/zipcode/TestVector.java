package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void testVectorAdd(){
        Vector vector = new Vector(0);
        vector.addElement("Hello");

        Assert.assertEquals(true, vector.contains("Hello"));
    }

    @Test
    public void testVectorRemove(){
        Vector vector = new Vector(0);
        vector.addElement(1);
        vector.addElement("Dog");
        vector.addElement(3);

        vector.remove(2);

        Assert.assertEquals(2, vector.size());
    }
}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TesetPriorityQueue {
    @Test
    public void testPriority(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Hello");
        pq.add("1");
        pq.add("2");
        pq.add("3");

        Assert.assertEquals(4, pq.size());
    }

    @Test
    public void testPriority2(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Hello");
        pq.add("1");
        pq.add("2");
        pq.add("3");
        pq.poll();
        pq.poll();

        Assert.assertEquals(2, pq.size());
    }
}

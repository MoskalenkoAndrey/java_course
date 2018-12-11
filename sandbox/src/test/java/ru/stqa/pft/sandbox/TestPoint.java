package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {

    @Test
    public void testDistanse () {
        Point p1 = new Point (2.0, 3.0);
        Point p2 = new Point (10.0, 12.0);
        Assert.assertEquals(p1.distance(p2.x, p2.y), 15.198684153570664);
    }
}

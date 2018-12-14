package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

  @Test
  public void testArea () {
    Point s = new Point (2, 6);
    Assert.assertEquals (s.distance(), 25);

  }
}
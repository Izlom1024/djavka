package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance (double tochka1, double tochka2){

    return Math.sqrt (((tochka1 - this.x)*(tochka1 - this.x)) + ((tochka2 - this.y) * (tochka2 - this.y)));
  }

  public double distance(Point p2) {

      return distance(p2.x, p2.y);
  }
}
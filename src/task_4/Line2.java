package src.task_4;

import src.task_2.Line;
import src.task_1.Point;

public class Line2 extends Line {
  private double  x1 ;
  private double x2 ;
  private double y1 ;
  private double y2 ;
  
  public Line2(double x1 , double y1 , double x2 , double y2) {
    super(new Point(x1 , y1) , new Point(x2 , y2)) ; 
    this.x1 = x1 ;
    this.x2 = x2 ; 
    this.y1 = y1 ;
    this.y2 = y2 ;


  }


  public double getX1() { return x1; } ;
  public double getX2() { return x2; } ;
  public double getY1() { return y1; } ;
  public double getY2() { return y2; } ;
  public Line2(Point start, Point end) {
    super(start , end) ;
  }
  

  @Override 
  public String toString(){
    return super.toString();
  }
}

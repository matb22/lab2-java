package src.task_5;

import src.task_4.Line2;

public class Line3 extends Line2{
  private double x1 ;
  private double y1 ;
  private double x2 ;
  private double y2 ;

  public Line3(double x1 , double y1 , double x2 , double y2) {
    super(x1 , y1 , x2 , y2) ;
    this.x1 = x1 ;
    this.y1 = y1 ;
    this.x2 = x2 ;
    this.y2 = y2 ; 
  }

  public double range(){
    double rangePoints ;
    rangePoints = Math.hypot((x2 - x1), (y2 - y1)) ;

    return rangePoints ;
  }

  @Override 
  public String toString(){
    return super.toString();
  }
}

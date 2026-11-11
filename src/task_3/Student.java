package src.task_3;

import java.lang.reflect.Array;

public class Student {
  private String name ;
  private int marks[];

  public Student(String name , int marks[]){
    if(name == null || marks == null) {
      throw new IllegalArgumentException("у студента должно быть имя и оценки .") ;
    }

    this.name = name ;
    this.marks = marks ;
  }





  public String toString() {
    String resultMarks = "";
    for(int i : marks){
      resultMarks = resultMarks+ i + " " ;
      
    }
    return "" + name + "с оценками : "  + resultMarks ;
  }
}

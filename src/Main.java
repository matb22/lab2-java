package src;
import java.util.Scanner;
import src.task_4.Line2;
import src.task_2.Line;
import src.task_1.Point;
import java.util.Scanner;
import src.task_3.Student;
import src.task_5.Line3;
import java.util.Arrays;

public class Main {
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  Menu.printMenu();
  try {
    int taskNumber = sc.nextInt();
    Menu.selectTask(taskNumber);
  }
  catch(IllegalArgumentException e) {
    System.out.println(e);
  }
   
  
    
  }
}



class Menu {
  
  public static void printMenu() {
    System.out.println("выберите номер задачи :");
    System.out.println("1)Создайте сущность Точка, расположенную на двумерной плоскости ");
    System.out.println("2)Создайте сущность Линия, расположенную на двумерной плоскости");
    System.out.println("3)Создайте сущность Студент");
    System.out.println("4)Измените сущность Точка из задачи 1.1. В соответствии с новыми требованиями создать объект\n" + //
            "Точки можно только путем указания обеих координат:X и Y.");
    System.out.println("5)Измените сущность Линия из задачи 2.1. Новые требования включают:\n" + //
            "• Создание Линии возможно с указанием Точки начала и Точки конца (Точки из задачи 4.1)\n" + //
            "• Создание Линии возможно с указанием координат начала и конца как четырех чисел\n" + //
            "(x1,y1,x2,y2");
    System.out.println("6)Измените сущность Линия из задачи 4.2. Добавьте ей возможность возвращать по запросу\n" + //
            "пользователя расстояние между точками начала и конца (в виде целого числа)");

    System.out.println("-->");
  }
  public static void selectTask(int taskNumber) {
    switch (taskNumber) {
      case 0:
        break ; 
        
      case 1:
        System.out.println("Задача 1");
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        System.out.println("1)"+point1.toString() + "\n2)" + point2.toString() + "\n3)" + point3.toString() ) ;
        
        break;
      case 2:
        System.out.println("Задача 2");
        Point point4 = new Point(1, 3);
        Point point5 = new Point(23, 8);
        Line line1 = new Line(point4 , point5);
        Line line2 = new Line(new Point(5, 10), new Point(25, 10));
        System.out.println("1)" + line1.toString() + "2)" + line2.toString());
        
        line1.setStart(new Point(111,222)); line1.setEnd(new Point(333 , 444));
        line2.setStart(new Point(555,666)); line2.setEnd(new Point(777 , 888));

        
        
        System.out.println("линии после изменения координат : \n" + "1)" + line1.toString() + "2)" + line2.toString());

        Line line3 = new Line(line1.getStart() , line2.getEnd()) ;

        //5 зд 
        line1.setStart(line3.getStart()); line1.setEnd(new Point(333 , 444));
        System.out.println("коорд 1 линии изменились не меняя коорд 3 линии : 1 )" + line1.toString() + "2)" + line2.toString() );
        break;
      case 3:
        
        Student student1 = new Student("Вася", new int []  {3,4,5});
        System.out.println(student1.toString());
        Student student2 = new Student("Петя ", student1.getMarks());
        System.out.println(student2.toString());

        int[] newPetyaMarks = student2.getMarks(); 
        newPetyaMarks[0] = 5; 
        student2.setMarks(newPetyaMarks);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        Student andrey = new Student("Андрей", Arrays.copyOf(student1.getMarks(), student1.getMarks().length));
        System.out.println(andrey.toString());


        break;
      case 4 :
        Point point1_4 = new Point(3,5);
        System.out.println("точка :" + point1_4.toString());
        System.out.println("точка :" + new Point(25,6));
        System.out.println("точка :" + new Point(7,8));
        break;
      case 5:
        Line2 line5_1 = new Line2(1 , 3 , 23 ,8) ;
        System.out.println("1)" + line5_1.toString());
        Line2 line5_2 = new Line2(5 ,10 ,25 ,10 ) ;
        System.out.println("2)" + line5_2.toString());
        Line2 line5_3 = new Line2(line5_1.getX1() , line5_1.getY1() , line5_2.getX2() , line5_2.getY2()) ;
        System.out.println("3)" + line5_3.toString());
        break;
      case 6:
        Line3 line6_1 = new Line3(1 , 1 ,10 ,15);
        System.out.println("длина линии: " + line6_1.toString() + " = " + line6_1.range());
        break;
      default:
        System.out.println("Неверный номер задачи");
    }
  }
}

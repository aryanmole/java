import java.util.*;

class car{
  int year;
  String name;
  
  car(int y,String n){
    year=y;
    name=n;
  }
  
  

}

public class PC{
  public static void main(String[] args){
     car c=new car(2024,"Tesla");
     System.out.println("Car name="+c.name);
     System.out.println("Car year="+c.year);
  }
}

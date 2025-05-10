import java.util.*;

class car{
  int year;
  String name;
  
  car(){
   year=2009;
   name="Unknown";
  }
}

public class NA{
 public static void main(String[] args){
   car c=new car();
   
   System.out.println("Car year="+c.year);
   System.out.println("Car name="+c.name);
 }
}

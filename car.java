import java.util.*;

class car{
  int year;
  String name;
  
  car(){
    year=0;
    name="Unknown";
  }
  
 
}

public class Car{
public static void main(String[] args){

  car c=new car();
  System.out.println("Car Year="+c.year);
  System.out.println("Car Name="+c.name);
}
}


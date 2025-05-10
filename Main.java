import java.util.*;

class Volume {
  double width;
  double depth;
  double height;
  
 
  double calculateVolume() {
    return width * height * depth;
  }
}

public class Main {
  public static void main(String[] args) {
    double v;
    Volume obj = new Volume();
    obj.width = 5.5;
    obj.height = 7;
    obj.depth = 6.5;
    

    v = obj.calculateVolume();
    System.out.println("Volume = " + v);
  }
}


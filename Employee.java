import java.util.*;

class Emp{
   String name;  
    double id;    
    double salary;
          
 
           void input(){
               Scanner scanner=new Scanner(System.in);
               
               System.out.println("Enter employee name=");
             name=scanner.nextLine();
               
               System.out.println("Enter employee id=");
               id = scanner.nextDouble(); 
               
               System.out.println("Enter employee salary=");
               salary = scanner.nextDouble();
 }
 
     void output(){
         Scanner scanner=new Scanner(System.in);
         
          System.out.println("employee name="+name);
           System.out.println("employee id="+id);
            System.out.println("employee salary="+salary);
    
}
}

public class Employee{
    public static void main(String[] args){
       Emp ob=new Emp();
       ob.input();
       ob.output();
    }
}



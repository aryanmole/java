import java.util.*;

abstract class Shape{
 abstract void area();
}

class Rectangle extends Shape{
 int length,width,res;
 
 Rectangle(int l,int w){
  length=l;
  width=w;

 }
 
 void input(){
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter length=");
   length=sc.nextInt();
   System.out.println("Enter width=");
   width=sc.nextInt();
 }
 void area(){
   res=length*width;
   System.out.println("Area of rectangle="+res);
 }
}

class Circle extends Shape{
 int rad;
 double ans;
  
 Circle(int r){

  rad=r;
 }
 
  void display(){
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter radius=");
   rad=sc.nextInt();
 }
 
 void area(){
   ans=3.14*rad*rad;
   System.out.println("Area of circle="+ans);
 }
}

class Abstract{
 public static void main(String[] args){
  Rectangle rect=new Rectangle(0,0);
  Circle c=new Circle(0);
  
  rect.input();
  rect.area();
  
  c.display();
  c.area();
 }
}

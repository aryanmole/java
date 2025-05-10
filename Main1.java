import java.util.*;

interface Shape{
	void area();
}

class Rectangle implements Shape{
	double len,wid,a;
	Scanner sc=new Scanner(System.in);
	
	Rectangle(double l,double w){
	  len=l;
	  wid=w;
	}
	
	public void get(){
			System.out.println("Enter length=");
			len=sc.nextDouble();
			System.out.println("Enter width=");
			wid=sc.nextDouble();
		}
	
	public void area(){
		a=len*wid;
		System.out.println("Area="+a);
	}
}

class Main1{
public static void main(String[] args){
	Rectangle r=new Rectangle(1,2);
	r.get();
	r.area();
}
}

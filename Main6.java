import java.util.*;

abstract class Shape{
	int dim1,dim2;
	
	Shape(int a,int b){
		dim1=a;
		dim2=b;
	}
	
	abstract void area();
}

class Rectangle extends Shape{
	int len,wid,area;
	Scanner sc=new Scanner(System.in);
	
	  public Rectangle(int l, int w) {
        super(l, w); // Initialize dim1 and dim2 in Shape
        len = dim1;  // Use dim1 and dim2 from Shape
        wid = dim2;
    }
	
	void get(){
		System.out.println("Enter length and width=");
		len=sc.nextInt();
		wid=sc.nextInt();
	}
	
	void area(){
		area=len*wid;
		System.out.println("Area="+area);
	}
}

class Main6{
	public static void main(String[] args){
		Rectangle r=new Rectangle(0,0);
		r.get();
		r.area();
	}
}

import java.util.*;

class Area{
	double length,breadth,area;
	Scanner sc=new Scanner(System.in);
	
	public Area(double l,double b){
		length=l;
		breadth=b;
	}
	
	public void setdim(){
		System.out.println("Enter length=");
		length=sc.nextDouble();
		System.out.println("Enter breadth=");
		breadth=sc.nextDouble();
	}
	public void getarea(){
		area=length*breadth;
		System.out.println("Area="+area);
	}

}

class Rectangle{
  public static void main(String[] args){
	Area a=new Area(2,3);
	a.setdim();
	a.getarea();
}
}

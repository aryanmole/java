import java.util.*;

class Car{
	int year;
	String name;
	
	Car(int y,String n){
		year=y;
		name=n;
	}
}

class test{
	public static void main(String[] args){
		Car c=new Car(2024,"Nissan");
		System.out.println("Car year="+c.year);
		System.out.println("Car name="+c.name);
	}
}

import java.util.*;

class Car{
	int year;
	String name;
	
	Car(){
		year=0;
		name="Unknown";
	}
}

class test1{
	public static void main(String[] args){
		Car c=new Car();
		System.out.println("Car year="+c.year);
		System.out.println("Car name="+c.name);
	}
}

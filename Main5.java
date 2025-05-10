import java.util.*;

class Employee{
	double sal;
	String name,address,title;
	
	public Employee(double s,String n,String a,String t){
		sal=s;
		name=n;
		address=a;
		title=t;
	}
	
	public void bonus(){
		sal=sal+(sal*0.5);
		System.out.println("Bonus salary="+sal);
	}
	public void perform(){
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Salary="+sal);
		System.out.println("Title="+title);
	}
	
	public void manage() {
        System.out.println(name + " is working on a company-wide project.");
    }
}

class Manager extends Employee{
	
	public Manager(double s,String n,String a,String t){
		super(s,n,a,t);
	}
	
	public void bonus(){
		sal=sal+(sal*0.10);
				System.out.println("Bonus salary="+sal);
	}
	
	public void manage() {
        System.out.println(name + " is working on a company's Employee");
    }
}

class Developer extends Employee{
	
	public Developer(double s,String n,String a,String t){
		super(s,n,a,t);
	}
	
	public void bonus(){
		sal=sal+(sal*0.15);
				System.out.println("Bonus salary="+sal);
	}
	
	public void manage() {
        System.out.println(name + " is working on backend and db");
    }
}

class Programmer extends Employee{
	
	public Programmer(double s,String n,String a,String t){
		super(s,n,a,t);
	}
	
	public void bonus(){
		sal=sal+(sal*0.20);
				System.out.println("Bonus salary="+sal);
	}
	
	public void manage() {
        System.out.println(name + " is working on frontend");
    }
}

class Main5{
	public static void main(String[] args){
		Manager m=new Manager(10000,"aryan","b-4","Manager");
		Developer d=new Developer(15000,"tanish","c-4","Developer");
		Programmer p=new Programmer(20000,"chut","d-4","Programmer");
		
		m.perform();
		m.bonus();
		m.manage();
		
		d.perform();
		d.bonus();
		d.manage();
		
		p.perform();
		p.bonus();
		p.manage();
	}
}

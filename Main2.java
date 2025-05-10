import java.util.*;

class Student{
	int roll;
	Scanner sc=new Scanner(System.in);
	
	public Student(int r){
	roll=r;
	}
	
	void get(){
		System.out.println("Enter rollno=");
		roll=sc.nextInt();
	}
	void set(){
		System.out.println("Rollno="+roll);
		
	}
	
}

class Test extends Student{
	int sub1,sub2;
	Scanner sc=new Scanner(System.in);
	
	public Test(int s,int p,int r){
	super(r);
	sub1=s;
	sub2=p;

	}
	
	void get1(){
		System.out.println("Enter 1st Subject marks=");
		sub1=sc.nextInt();
		System.out.println("Enter 2nd Subject marks=");
		sub2=sc.nextInt();
	}
	void set1(){
		System.out.println("Subject 1 marks="+sub1);
		System.out.println("Subject 2 marks="+sub2);
	}
	
}


interface Sports{
	int smarks=10;
	
	void sm();
}

class Result extends Test implements Sports{
int tot;

public Result(int s,int p,int r,int t){
super(s,p,r);
tot=t;

	}

public void sm(){
		System.out.println("Grace marks is being added");
	}
	
	public void total(){
		tot=smarks+sub1+sub2;
		System.out.println("Total marks="+tot);
	}
}

class Main2{
public static void main(String[] args){
	Result r=new Result(1,2,3,4);
	r.get();
	r.set();
	r.get1();
	r.set1();
	r.sm();
	r.total();
}
}

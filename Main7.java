import java.util.*;

class Student{
	int roll;
	
	Scanner sc=new Scanner(System.in);
	
	public Student(int r){
		roll=r;
	}
	
	public void get(){
		System.out.println("Enter rollno=");
		roll=sc.nextInt();
	}
	public void set(){
		System.out.println("Roll no="+roll);
		
	}
}

class Test extends Student{
	int sub1,sub2;
	
	Scanner sc=new Scanner(System.in);
	
	public Test(int a,int b,int r){
		super(r);
		sub1=a;
		sub2=b;
		
	}
	
	public void getm(){
		System.out.println("Enter Subject 1 marks=");
		sub1=sc.nextInt();
		System.out.println("Enter Subject 2 marks=");
		sub2=sc.nextInt();
	}
	public void setm(){
		System.out.println("Subject 1 marks="+sub1);
		System.out.println("Subject 2 marks="+sub2);
	}
}

class Result extends Test{
int total;

		public Result(int a,int b,int r,int t){
		    super(a,b,r);
		    total=t;
		}
		
		void tot(){
		      total=sub1+sub2;
		      System.out.println("Total="+total);
		}
	
}

class Main7{
	public static void main(String[] args){
		Result t=new Result(0,0,0,0);
		t.get();

		t.getm();
				t.set();
		t.setm();
		t.tot();
	}
}

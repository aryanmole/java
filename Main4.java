import java.util.*;

class Bank{
	int balance=500,dep,with,ex=0;
	Scanner sc=new Scanner(System.in);
	
	public Bank(int w,int d,int b,int e){
		with=w;
		dep=d;
		balance=b;
		ex=e;
	}
	
	public void deposit(){
			System.out.println("Enter Depositing amount=");
			dep=sc.nextInt();
			
			
			if(dep>=0){
				balance+=dep;
				System.out.println("Amount Deposited ="+dep);
				System.out.println("Amount Balance ="+ex);
			}else{
				System.out.println("Insufficient Request");
			}
	}
	
	
	public void withdraw(){
			System.out.println("Enter withdrawing amount=");
			with=sc.nextInt();
			
			if(balance-with>0){
				balance=balance-with;
				System.out.println("Amount withdrawed ="+with);
				System.out.println("Amount Balance ="+balance);
			}else{
				System.out.println("Insufficient balance");
			}
	}
	
}

class Savings extends Bank{

	public Savings(int w,int d,int b,int e){	
		super(w,d,b,e);
	}
	

	public void withdraw(){
		if(balance-with>100){
				balance=balance-with;
				System.out.println("Amount withdrawed ="+with);
				System.out.println("Amount Balance ="+balance);
			}else{
				System.out.println("Can't take amount as the balance is less than 100");
			}
	}
}

class Main4{
	public static void main(String[] args){
		Savings s=new Savings(1,2,3,4);
		s.deposit();
		s.withdraw();
	}
}


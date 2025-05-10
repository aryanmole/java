import java.util.*;

class Prime{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		n=sc.nextInt();
		
		if(n%2==0 && n%3==0 && n%7==0){
			System.out.println("It is not a prime number=");
		}else{
			System.out.println("It is a prime number");
		}
	}
}

import java.util.*;

public class Stack{
	public static void main(String[] args){
		int size = 5;
		int top=-1;
		int[] stack=new int[size];
		int n;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Stack Operation");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter the choice=");
			n=sc.nextInt();
			
			switch(n){
				case 1:
					if(top<size-1){
						System.out.println("Enter pushing element=");
						int value=sc.nextInt();
						top++;
						stack[top]=value;
						System.out.println("Element is pushed");
					}else{
						System.out.println("Can't insert an elelemnt , Overflow condition");
					}
					 break;
					
				case 2:
					if(top>=0){
						System.out.println("Popping element="+stack[top]);
						top--;
					}else{
						System.out.println("Underflow condition");
					}
					 break;
					
				case 3:
					if(top>=0){
						System.out.println("Display element="+stack[top]);
						for(int i=0;i<top;i++){
							System.out.print(stack[i] + " ");
						}
						System.out.print("");	
					}else{
						System.out.print("Stack is empty");
					}
					 break;
					
				case 4:
					 System.out.println("Exiting...");
                    			 break;
					
			}
			
			
		}
		while(n!=0);
		
		    sc.close();
	}
	
}

import java.util.*;

public class Queue{
	public static void main(String[] args){
		int size = 5;
		int front=0;
		int rear=-1;
		int[] queue=new int[size];
		int n;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Queue Operation");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter the choice=");
			n=sc.nextInt();
			
			switch(n){
				case 1:
					if(rear<size-1){
						System.out.println("Enter pushing element=");
						int value=sc.nextInt();
						rear++;
						queue[rear]=value;
						System.out.println("Element is pushed");
					}else{
						System.out.println("Can't insert an elelemnt , Overflow condition");
					}
					 break;
					
				case 2:
					if(front>rear){
						
						System.out.println("Underflow condition");
					}else{
						System.out.println("Popping element="+queue[front]);
						front++;
					}
					 break;
					
				case 3:
					if(front>rear){
							
						System.out.print("Stack is empty");
					}else{
						System.out.println("Display element=");
						for(int i=front;i<=rear;i++){
							System.out.print(queue[i] + " ");
						}
						System.out.print("");
					}
					 break;
					
				case 4:
					 System.out.println("Exiting...");
                    			 break;
					
			}
			
			
		}
		while(n!=4);
		
		    sc.close();
	}
	
}

import java.util.*;

class Main8{
	public static void main(String[] args){
		String[] arr=new String[10];
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 10 alphabets=");
		
		for(int i=0;i<10;i++){
		      
		      
		      arr[i]=sc.nextLine();
		}
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].compareToIgnoreCase(arr[j])>0){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		  }
		  
		
		
	}
	
		for(String num:arr){
			System.out.println(num);
		}
		}
}

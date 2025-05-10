import java.util.*;

class SORT{
	public static void main(String[] args){
		int arr[]={4,2,6,9,10,3,1,5,7,8};
		int temp;
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("Sorted array=");
		for(int k=0;k<arr.length;k++){
		      System.out.println(" "+arr[k]);
		}
	}
}

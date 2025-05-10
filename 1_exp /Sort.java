import java.util.*;

public class Sort{
 public static void main(String[] args){
    int[] arr={6,7,1,9,2,0,3,8,4,5};
    int n = arr.length;
    
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
          if(arr[i]>arr[j]){
             int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
          }
      }
    }
    for (int num : arr)
            System.out.print(num + " ");
    }
 }


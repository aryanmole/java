import java.util.*;

public class Merge{
 public static void main(String[] args){
    int[] arr1={1,2,3,4,5};
     int[] arr2={6,7,8,9,10};
    int[] merge=new int[arr1.length+arr2.length];
    int i = 0, j = 0, k = 0;
    
    while(i<arr1.length && j<arr2.length){
     if(arr1[i]<arr2[j]){
        merge[k++]=arr1[i++];
     }else{
     merge[k++]=arr2[j++];
 }
    }
    
    while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }

       
        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }
    
    for (int num : merge)
            System.out.print(num + " ");
    }
 }

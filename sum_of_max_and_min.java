import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int max=arr[0];
      int min=arr[0];
      for(int i=0;i<n;i++){
        if(arr[i]>max){
          max=arr[i];
        }
        if(arr[i]<min){
          min=arr[i];
        }
      }
      return max+min;
  }
}

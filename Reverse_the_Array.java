import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int end=arr.size()-1;
        int start=m+1;
            
         while(start<end){
             Collections.swap(arr, start, end);
             start++;
             end--;
         }
        // Write your code here.
    }

    
}

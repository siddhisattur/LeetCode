import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
    Arrays.sort(arr);
    int ans=0;
    for(int n: arr){
      ans^=n;
    }
    return ans;
    }
}


// Sample Input 1:

// 1
// 7
// 2 3 1 6 3 6 2

// Sample Output 1:

// 1

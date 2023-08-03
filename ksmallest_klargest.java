import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		Collections.sort(arr);
		ArrayList<Integer> ans=new ArrayList<>();
		int max=arr.get(k-1);
		Collections.sort(arr, Collections.reverseOrder());
		int min=arr.get(k-1);
		ans.add(max);
		ans.add(min);
		return ans;
	}
}

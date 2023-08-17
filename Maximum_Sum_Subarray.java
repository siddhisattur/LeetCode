//brute force approach

// O(n3)
public static long maxSubarraySum(int[] arr, int n) {
		long maxsum=0;
		for(int i=0;i<n;i++){
			
			for(int j=i;j<n;j++){
				long sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
				}
				maxsum=Math.max(maxsum, sum);
			}
		}
		return maxsum;
	}

//O(n2)
public static long maxSubarraySum(int[] arr, int n) {
		long maxsum=0;
		for(int i=0;i<n;i++){
			long sum=0;
			for(int j=i;j<n;j++){
				
				
					sum+=arr[j];
				
				maxsum=Math.max(maxsum, sum);
			}
		}
		return maxsum;
	}
//O(n)
//Kadane's Algorithm

public static long maxSubarraySum(int[] arr, int n) {
		long maxsum=0,currsum=0;
		for(int i=0;i<n;i++){
			currsum=currsum+arr[i];
			if(currsum>maxsum)
			maxsum=currsum;

			if(currsum<0)
			currsum=0;
		}
			return maxsum;
		
	}

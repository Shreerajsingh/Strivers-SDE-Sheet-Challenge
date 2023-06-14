public class MaximumSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum=0,max=0;
		for(int i=0;i<n;i++){
			if(sum+arr[i]>0){
				sum=sum+arr[i];
				if(sum>max) max=sum;
			}
			else if(sum+arr[i]<=0) sum=0;
		}
		return max;
	}
}

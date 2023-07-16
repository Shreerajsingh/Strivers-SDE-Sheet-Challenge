// import java.util.* ;
// import java.io.*; 
import java.util.ArrayList;

public class MaxSlidingWindow 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		// Write your code here.
		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0;i<nums.size()-k;i++){
			int max=nums.get(i);
			for(int j=i;j<i+k;j++){
				if(nums.get(j)>max) 
					max=nums.get(j);
			}
			al.add(max);
		}

		return al;
	}
}
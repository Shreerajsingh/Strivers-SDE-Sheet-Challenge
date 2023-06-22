import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class LongSubArrSumZrr {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int sum=0, count=0;
		int max=0;

		for(int i=0;i<arr.size();i++){
			for(int j=i;j<arr.size();j++){
				sum += arr.get(j);
				count++;
				if(sum==0){
					if(count>max) max=count;
				}
			}
			sum=0;
			count=0;
		}

		return max;
	}
}
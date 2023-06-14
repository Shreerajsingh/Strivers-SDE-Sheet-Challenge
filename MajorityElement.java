// import java.io.*;
// import java.util.* ;

public class MajorityElement {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int maxel = 0;
    	int minel = -1;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>maxel && arr[i]>=0) maxel=arr[i];
			else if(arr[i]<minel && arr[i]<0) minel=arr[i];
		}

		int arrp[]=new int[maxel+1];
		int arrn[]=new int[1+(-minel)];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0) arrp[arr[i]]++;
			else arrn[-arr[i]]++;
		}

		int max=0,value=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0 && arrp[arr[i]]>max){
				max=arrp[arr[i]];
				value=arr[i];
			}
			else{
				if(arr[i]<0 && arrn[-arr[i]]>max){
					max=arrn[-arr[i]];
					value=arr[i];
				}
			}
		}

		if(max<=arr.length/2) return -1;

		return value; 

	}
}
import java.util.* ;
import java.io.*; 

public class TripletSum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k)  {

	    // Write your code here.
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++){
			int temp=arr[i];
			int p1=i+1;
			int p2=n-1;
			while(p1<p2){
				if(temp+arr[p1]+arr[p2] < k) p1++;
				else if(temp+arr[p1]+arr[p2] > k) p2--;
				else{
					ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(temp);
                    triplet.add(arr[p1]);
                    triplet.add(arr[p2]);
                    al.add(triplet);
                    
					while(p1<p2 && arr[p1]==arr[p1+1]) p1++;
					while(p1<p2 && arr[p2]==arr[p2-1]) p2--;
					p1++;
                    p2--;
				}
			}
			while(i<n-1 && arr[i]==arr[i+1]) i++;
			
		}
		return al;
	}
}

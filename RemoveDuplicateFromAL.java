import java.util.*;
public class RemoveDuplicateFromAL {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int uniqueEl = 1;

		if( n == 1){
			return 1;
		}
		for( int i = 0; i< n - 1; i++){
			if(! arr.get(i).equals(arr.get(i + 1))){
				uniqueEl++;
			}
		}
		return uniqueEl;
	}
}
import java.util.ArrayList;

public class NextPermutation 
{
	public static void swap(int a, int b, ArrayList<Integer> permutation){
		int temp=permutation.get(a);
		permutation.set(a,permutation.get(b));
		permutation.set(b,temp);
	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int l=permutation.size();

		if(l==1){
			return permutation;
		}
		else if(l==2){
			swap(0, 1, permutation);
			return permutation;
		}
		else{
			int x=l-1;
			for(int i=0;i<l-1;i++){
				if(permutation.get(x-1-i)<permutation.get(x-i)){
					x=x-i-1;
					break;
				} 
			}

			if(x<l-1){
				int nextmin=x+1;
				for(int i=x;i<l;i++){
					if(permutation.get(i)>permutation.get(x) && permutation.get(i)<permutation.get(nextmin)) nextmin=i;
				}

				swap(x, nextmin, permutation);

				int k=0;
				for(int i=0;i<(l-x)/2;i++){
					swap(x+1+k, l-1-k, permutation);
					k++;
				}

			}

			if(x==l-1){
				for(int i=0;i<l/2;i++){
					swap(i, l-1-i, permutation);
				}
			}
			



			return permutation;
		}
	}
}

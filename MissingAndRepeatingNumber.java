// import java.util.* ;
// import java.io.*; 
import java.util.ArrayList;

public class MissingAndRepeatingNumber {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int arrx[]=new int[n];

        for(int i=0;i<n;i++){
            arrx[arr.get(i)-1]++;
        }

        int arry[]=new int[2];

        for(int i=0;i<n;i++){
            if(arrx[i]==0) arry[0]=i+1;
            else if(arrx[i]==2) arry[1]=i+1;
        }

        return arry;
    }

    public static void main(String[] args) {
        
    }
}
// import java.io.*;
// import java.util.* ;

import java.util.ArrayList;

public class FindDuplicateInArray{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int arrx[]=new int[n];
        int ans=-1;
        for(int i=0;i<n;i++){
            arrx[arr.get(i)-1]++;
            if(arrx[arr.get(i)-1]>1){
                ans=arr.get(i);
                break;
            }
        }

        return ans;
    }
}

// import java.util.* ;
// import java.io.*; 
public class TrapWater {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long t=0;
        int p1=0;
        int p2=n-1;
        long maxr=0;
        long maxl=0;
        
        while(p1<=p2){
            if(arr[p1]<=arr[p2]){
                if(arr[p1]>=maxl) maxl=arr[p1];
                else t += maxl-arr[p1];
                p1++;
            }
            else{
                if(arr[p2]>maxr) maxr=arr[p2];
                else t += maxr-arr[p2];
                p2--;
            }
        }
        return t;
    }
}

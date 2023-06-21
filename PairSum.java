// import java.io.*;
import java.util.* ;

public class PairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        HashMap<Integer,Integer> map= new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i], 1);
            else map.put(arr[i], map.get(arr[i])+1);
        }

        for(int i=0;i<arr.length;i++){
            int temp=s-arr[i];
            if(map.containsKey(temp)){
                // list.add(new int[]{arr[i],temp});
                if(temp==arr[i]){
                    int p=map.get(temp);
                    for(int j=0;j<p*(p-1)/2;j++){
                        list.add(new int[]{temp, temp});
                    }
                    map.remove(temp);
                }
                else{
                    int p=map.get(temp);
                    int q=map.get(arr[i]);
                    for(int j=0;j<p*q;j++){
                        list.add(new int[]{arr[i], temp});
                    }
                    map.remove(temp);
                    map.remove(arr[i]);
                }
            }
        }

        return list;
    }
}

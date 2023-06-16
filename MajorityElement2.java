// import java.io.*;
// import java.util.* ;

import java.util.ArrayList;

public class MajorityElement2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int maxel = 0;
        int minel = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxel && arr.get(i) >= 0)
                maxel = arr.get(i);
            else if (arr.get(i) < minel && arr.get(i) < 0)
                minel = arr.get(i);
        }

        int arrp[] = new int[maxel + 1];
        int arrn[] = new int[1 + (-minel)];

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0)
                arrp[arr.get(i)]++;
            else
                arrn[-arr.get(i)]++;
        }

        int l=arrn.length;
        if(arrp.length>arrn.length){
            l=arrp.length;
        }

        
        for (int i = 0; i < l; i++) {
            if (i<arrp.length && arrp[i] > arr.size()/3) {
                al.add(i);
            }
            if (i<arrn.length && arrn[i] > arr.size()/3) {
                al.add(-i);
            }
        }

        return al;
    }
}
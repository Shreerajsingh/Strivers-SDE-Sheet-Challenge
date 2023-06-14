import java.util.ArrayList;

public class PascalsTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> al = new ArrayList<ArrayList<Long>>();
        al.add(new ArrayList<Long>());
        al.get(0).add(0,1L);
        for(int i=1;i<n;i++){
            al.add(new ArrayList<Long>());
            al.get(i).add(0,1L);
            al.get(i).add(1,1L);
            for(int j=1;j<i;j++){
                long z=al.get(i-1).get(j-1) + al.get(i-1).get(j);
                al.get(i).add(j,z);
            }
        }
        return al;
}
}

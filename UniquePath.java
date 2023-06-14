// import java.util.* ;
// import java.io.*; 

public class UniquePath {

	public static long factorial(int o,int m, int n) {
        long fact=1;
        int l=0;
        if(m>=n) l=m-1;
        else l=n-1;

        for (int i=1;i<=l;i++) {
            if(l+i>=m && l+i>=n && l+i<=o)fact= fact*(l+i);
            if(i<m && i<n) fact=(fact*i)/(i*i);
			else if(i<m) fact=(fact*i)/i;
			else if(i<n) fact=(fact*i)/i;
        }
        return fact;
    }

    public static int uniquePaths(int m, int n) {
        int o=m+n-2;
        return (int)(factorial(o,m,n));
    }
}

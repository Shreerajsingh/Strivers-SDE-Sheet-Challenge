// import java.io.*;
// import java.util.* ;

public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.    
        long ans=1;  
        long x2=x;
        while(n>0){
            if(n%2==1){
                ans=(ans*x2)%m;
                n--;
            }
            x2=(x2*x2)%m;
            n=n/2;
        }
        return (int)ans;
    }
}
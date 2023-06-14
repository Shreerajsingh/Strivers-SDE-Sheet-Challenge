public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int zero=0,one=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<zero){
                arr[i]=0;
            }
            else if(i>=zero+one){
                arr[i]=2;
            }
            else{
                arr[i]=1;
            }
        }
    }
}

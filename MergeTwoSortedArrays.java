public class MergeTwoSortedArrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int arr[]=new int[m+n];

        int p1=0,p2=0;

        for(int i=0;i<m+n;i++){
            if(p1==m && p2==n){
                break;
            }
            else if(p1==m){
                while(i<m+n){
                    arr[i]=arr2[p2];
                    p2++;
                    i++;
                }
                break;
            }
            else if(p2==n){
                while(i<m+n){
                    arr[i]=arr1[p1];
                    p1++;
                    i++;
                }
                break;
            }
            else{
                if(arr1[p1]<=arr2[p2] && arr1[p1]!=0){
                    arr[i]=arr1[p1];
                    p1++;
                }
                else if(arr1[p1]>arr2[p2]){
                    arr[i]=arr2[p2];
                    p2++;
                }
            }
        }
        return arr;
    }
}

public class SetMatrixZeros {
    public static void main(String[] args) {
        
    }
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

}
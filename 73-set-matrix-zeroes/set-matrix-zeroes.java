class Solution {
    public void setZeroes(int[][] matrix) {
         int m=matrix.length;
         int n=matrix[0].length;
         boolean fr=false;
         boolean sr=false;
         for(int i=0;i<n;i++){
            if(matrix[0][i]==0)fr=true;
         }
         for(int i=0;i<m;i++){
            if(matrix[i][0]==0)sr=true;
         }
         for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
         }
         for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
         }
        if (fr) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
        if (sr) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}
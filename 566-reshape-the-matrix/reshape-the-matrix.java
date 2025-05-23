class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int matrix[][]=new int[r][c];
         if(m*n!=r*c){
            return mat;
         }
         int count=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[count/c][count%c]=mat[i][j];
                count++;
            }
         }
         return matrix;
    }
}
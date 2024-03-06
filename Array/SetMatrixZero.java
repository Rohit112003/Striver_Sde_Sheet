package Array;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int arr[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(arr);
//        System.out.println(Arrays.toString(arr));
    }
        public static void setZeroes(int[][] matrix) {
            for(int i = 0; i<matrix.length;i++){
                for(int j = 0; j<matrix[i].length; j++){
                    if(matrix[i][j]==0){
                        setRow(matrix, i ,j);
                        setColumn(matrix,i,j);
                    }
                }
            }
            for(int i =0; i<matrix.length; i++){
                for(int j =0; j<matrix[i].length; j++){
                    if(matrix[i][j]==-10){
                        matrix[i][j]=0;
                    }
                }
            }
            System.out.println(Arrays.toString(matrix));
        }
        public static void setRow(int[][]matrix, int i , int j ){
            for(int k = 0;k <matrix[i].length; k++){
                if(matrix[i][k]!=0){
                    matrix[i][k]=-10;
                }
            }
        }
        public static void setColumn(int[][]matrix , int i , int j){
            for(int k=0; k <matrix.length;k++) {
                if(matrix[k][j]!=0){
                    matrix[k][j]=-10;
                }
            }
        }
    }
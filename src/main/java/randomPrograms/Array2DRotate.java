package main.java.randomPrograms;

import java.util.Arrays;

public class Array2DRotate {
    public static void main(String[] args) {
        rotateOne(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        rotateTwo(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void rotateOne(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        System.out.print(" Approach One: " + Arrays.deepToString(matrix));
    }

    public static void rotateTwo(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            //int last = matrix.length - 1 - i;
            for (int j = i; j < (matrix.length - 1 - i); j++) {
                int offset = j - i;
                int top = matrix[i][j];
                matrix[i][j] = matrix[(matrix.length - 1 - i) - offset][i];
                matrix[(matrix.length - 1 - i) - offset][i] = matrix[(matrix.length - 1 - i)][(matrix.length - 1 - i) - offset];
                matrix[matrix.length - 1 - i][(matrix.length - 1 - i) - offset] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = top;
            }
        }
        System.out.print(" Approach Two: " + Arrays.deepToString(matrix));
    }


}

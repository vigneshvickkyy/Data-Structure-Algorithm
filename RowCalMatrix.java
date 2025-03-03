package vignesh;

import java.util.Arrays;

public class RowCalMatrix {
    public static void main(String[] args) {
         int [][] arr = {
                 {10,20,30,40,50},
                 {15,25,35,45,55},
                 {89,95,100,110,120}
         };
         int target = 20;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix[0].length-1;

        while (r< matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c]<target) {
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

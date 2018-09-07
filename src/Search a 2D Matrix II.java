/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 */


 //剑指offer有做过，从左下角或者右上角开始搜索
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null||matrix.length==0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=m-1,j=0;i>=0&&j<n;){
            if(matrix[i][j]==target){
                return true;
            }else if(target>matrix[i][j]){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
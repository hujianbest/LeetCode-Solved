/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 */

//图片旋转的通常做法就是以对角线为对称线交换，然后在移动行或者列
//或者先移动行或者列，然后再以对角线为对称线交换
class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){//对角线交换
            for(int j=i;j<n;j++){
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        for(int i=0;i<m;i++){
            int left = 0;
            int right = n-1;
            while(left<right){//交换列
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
                left++;
                right--;
            }
        }
    }
}
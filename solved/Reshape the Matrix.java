class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int hang = nums.length;
        int lie = nums[0].length;
        int[] line= new int[hang*lie];
        int[][] hou = new int[r][c];
        if (hang*lie != r*c){
            System.err.println("There is no way to reshape a "+hang+" * "+lie+"matrix to a "+r+" * "+c+" matrix. So output the original matrix.");
            return nums;
        }else{
            int sum=0;
            for(int i=0;i<hang;i++)
                for(int j=0;j<lie;j++){
                    line[sum]=nums[i][j];
                    sum++;
                }
            sum=0;
            for(int i=0;i<r;i++)
                for(int j=0;j<c;j++){
                    hou[i][j]=line[sum];
                    sum++;
                }    
            return hou;
        }
    }
}
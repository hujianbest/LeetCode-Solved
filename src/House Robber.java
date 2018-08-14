class Solution {
    public int rob(int[] nums) {
        int[][] money = new int[nums.length+1][2];
        money[0][0]=0;
        money[0][1]=0;
        for(int i=1;i<=nums.length;i++){
            money[i][0]=Math.max(money[i-1][1],money[i-1][0]);
            money[i][1]=money[i-1][0]+nums[i-1];
        }
        return Math.max(money[nums.length][0],money[nums.length][1]);
    }
}
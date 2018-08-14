class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int maxHere=0;
        for(int n:nums){
            maxHere=(n==0?0:maxHere+1);
            max=Math.max(max,maxHere);
        }
        return max;
    }
}
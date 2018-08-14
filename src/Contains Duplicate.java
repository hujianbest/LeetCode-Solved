class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean re = false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                re = true;
                break;
            }    
        }
        return re;
    }
}
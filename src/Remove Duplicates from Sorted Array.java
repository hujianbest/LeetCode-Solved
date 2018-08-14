class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int j=0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]!=nums[j]) nums[++j]=nums[i];
        return ++j;
        // int result = nums.length;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         result--;
        // }
        // return result;
    }
}
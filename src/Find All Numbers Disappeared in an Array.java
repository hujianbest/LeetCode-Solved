class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            nums[Math.abs(nums[i])-1]=(nums[Math.abs(nums[i])-1]>0)?-nums[Math.abs(nums[i])-1]:nums[Math.abs(nums[i])-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                ret.add(i+1);
        }
        return ret;
    }
}
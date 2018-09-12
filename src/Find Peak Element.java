/**
 * A peak element is an element that is greater than its neighbors.
 */

//Mine
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0&&i!=nums.length-1){
                if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
                    return i;
            }else if(i==0){
                if(nums[i]>nums[i+1])
                    return i;
            }else if(nums[i]>nums[i-1])
                return i;
        }
        return -1;
    }
}


//怎么优化
//极大值肯定是符合条件的，二分查找极大值


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums and a target value k, 
 * find the maximum length of a subarray that sums to k. 
 * If there isn't one, return 0 instead.
 */

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        int sum = 0;
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                res = i+1;
            }else if(map.containsKey(sum-k)){//说明这两者之间的和为K
                res = Math.max(res, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){//为保证最长，只保留第一次出现的数
                map.put(sum, i);//空间换时间
            }
        }
        return res;
    }
}
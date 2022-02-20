import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组。
 */

class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){//改为找连续和为0
            if(nums[i]==0) nums[i]=-1;
        }
        int res = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){//相等说明这两者之间的和为0
                res = Math.max(res, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return res;
    }   
}
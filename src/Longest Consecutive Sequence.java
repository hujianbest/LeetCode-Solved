/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * Your algorithm should run in O(n) complexity.
 */

import java.util.List;
import java.util.Arrays;
import java.util.Deque;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for(int n:nums){//利用Integer的hashcode其实做了排序，O(n)
            set.add(n);
        }
        
        for(int n:set){//set遍历就会从最小的hashcode开始了，其实也就是最小的数//之前理解有误，跟是不是从最小开始遍历没关系，set也不会保证从最小开始遍历
            if(!set.contains(n-1)){//如果没有n-1，就要重新开始了
                int y = n + 1;      //有的话就不用管了，早晚都会遍历到的
                while(set.contains(y)){
                    y+=1;
                }
                max = Math.max(max, y-n+1);
            }
        }
        return max;
    }
}


/**
 * Union Find
 * 做这题其实还是为了练习下UF的思路
 */
class Solution0 {
    public int longestConsecutive(int[] nums) {
        
    }
}

//定义Union
class UF{

}
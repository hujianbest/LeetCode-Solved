/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */


 //思路：先把2就位，然后把0就位，剩下的1就自动就位了
 //而且要先就位2再就位0，如果是从后面开始往前遍历，就先0后2
class Solution {
    public void sortColors(int[] nums) {

        int redStart = 0;
        int blueEnd = nums.length-1;
        for(int i=0;i<nums.length;i++){
             while(nums[i]==2&&i<blueEnd){
                int tmp = nums[i];
                nums[i] = nums[blueEnd];
                nums[blueEnd] = tmp;
                blueEnd--;
            }
            while(nums[i]==0&&i>redStart){
                int tmp = nums[i];
                nums[i] = nums[redStart];
                nums[redStart] = tmp;
                redStart++;
            }
           
        }
    }
}

//如果颜色有N种呢？
/**
 * 给定一个无序数组，
 * 包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，
 * 要求时间复杂度：O(n)，空间复杂度：O(1) 
 * LeetCode 628. Maximum Product of Three Numbers
 */

import java.util.Scanner;

//思路：找到最大的三个和最小的两个，然后比较下乘积，有没有零没关系
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(n>max1){
                max3 = max2;
                max2 = max1;
                max1= n;
            }else if(n>max2){
                max3 = max2;
                max2 = n;
            }else if(n>max3){
                max3 = n;
            }

            if(n<min1){
                min2 = min1;
                min1 = n;
            }else if(n<min2){
                min2 = n;
            }
            
        }

        System.out.println(max1*max2*max3>max1*min1*min2?max1*max2*max3:max1*min1*min2);

    }
}
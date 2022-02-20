import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [hard]
 * Given a non-empty binary tree, find the maximum path sum.
 * For this problem, a path is defined as any sequence of nodes from 
 * some starting node to any node in the tree along the parent-child connections. 
 * The path must contain at least one node and does not need to go through the root.
 */




public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

 //自创暴力解法，把各种组合值放到list里，最后找个最大的
class Solution {
    public int maxPathSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        DFS(root, list);
        int max = Integer.MIN_VALUE;
        for(int i : list){
            max = Math.max(max, i);
        }
        return max;
    }

    public int DFS(TreeNode root, List<Integer> list) {
        if(root==null) return 0;

        int leftSum = DFS(root.left, list);
        int rightSum = DFS(root.right, list);
        if(leftSum>0) {
            list.add(leftSum);
            list.add(leftSum+root.val);
        }
        if(rightSum>0) {
            list.add(rightSum);
            list.add(rightSum+root.val);
        }
        list.add(root.val);
        list.add(rightSum+leftSum+root.val);
        if(leftSum>rightSum) 
            return leftSum>=0?root.val+leftSum:root.val;
        else 
            return rightSum>=0?root.val+rightSum:root.val;
    }
}


//更优秀的解答
class Solution0 {
    int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
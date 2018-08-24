import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

//二叉树的层序遍历，充分利用队列先进去先出来的特性 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();
        while(!queue.isEmpty()){//BFS是层序遍历的拓展，层序遍历不用考虑重复
            List<Integer> level = new ArrayList<>();
            int qsize = queue.size();
            for(int i=0;i<qsize;i++){//这便是一层
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(level);
        
        }
        return result;
    }
}
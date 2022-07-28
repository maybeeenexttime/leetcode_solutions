package leetcode_99;

import java.util.ArrayList;
import java.util.List;

public class Solution {


     public TreeNode getNearestLeft(TreeNode node){
         if(node.right == null && node.left == null ){
             return node;
         }
         if(node.val < node.left.val || node.val > node.right.val){

         }
         return new TreeNode();
     }

    public void dfs(TreeNode node){

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        node.left = node2;
        node.right = node4;
        node4.left = node3;


        System.out.println(node.val);

    }

}

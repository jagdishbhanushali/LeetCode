/**
 * Created by Jagdish Bhanushali on 1/7/2017.
 * https://leetcode.com/problems/invert-binary-tree/
 */

class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class InvertBinaryTree {
    TreeNode temp;
    public static void main(String args[]){
        TreeNode t1=new TreeNode(4);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(7);
        t1.left=t2;
        t1.right=t3;

        TreeNode t4=new TreeNode(1);
        TreeNode t5=new TreeNode(3);
        t2.left=t4;
        t2.right=t5;

        TreeNode t6=new TreeNode(6);
        TreeNode t7=new TreeNode(9);
        t3.left=t6;
        t3.right=t7;

        InvertBinaryTree ibt=new InvertBinaryTree();
        TreeNode ret=ibt.invertTree(t1);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root!=null)
        {
            temp=root.left;
            root.left=root.right;
            root.right=temp;

            if(root.left!=null)
                invertTree(root.left);

            if(root.right!=null)
                invertTree(root.right);
        }
        return root;
    }
}

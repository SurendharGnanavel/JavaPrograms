package Binarytree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data =data;
        }
    }

    public void createTreeNode(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
    }

    public void preOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrderTravesal(root.left);
        preOrderTravesal(root.right);
    }

    public void levelOrderTravesal(TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> qu = new LinkedList();
        qu.offer(root);
        while(!qu.isEmpty()){
            TreeNode temp  =qu.poll();
            System.out.println(temp.data+" ");
            if(temp.left!=null){
                qu.offer(temp.left);
            } if(temp.right!=null){
                qu.offer(temp.right);
            }
        }
    }

    public boolean isBalancedBinaryTree(TreeNode root){
        int leftHeight =0;int rightHeight =0;
        leftHeight = heightofTree(root,leftHeight);
        rightHeight = heightofTree(root,rightHeight);
        if(leftHeight==rightHeight){
            return true;
        }else if((leftHeight-rightHeight==1) ||(leftHeight-rightHeight==-1)||((rightHeight-leftHeight==-1))){
            return true;
        }else {
            return true;
        }
    }

    public int  heightofTree(TreeNode root, int count){
        if(root ==null){
            return count;
        }
        heightofTree(root.left,count++);
        return count;
    }

    public static void main(String[] args) {
        BinaryTree bt =  new BinaryTree();
        bt.createTreeNode();
        bt.preOrderTravesal(bt.root);
        bt.levelOrderTravesal(bt.root);
        System.out.println(bt.isBalancedBinaryTree(bt.root));
    }


}

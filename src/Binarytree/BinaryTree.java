package Binarytree;

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
        TreeNode seventh = new TreeNode(7);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
        third.left = seventh;
    }

    public void preOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTravesal(root.left);
        preOrderTravesal(root.right);
    }

    public void inOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTravesal(root.left);
        System.out.print(root.data+" ");
        inOrderTravesal(root.right);
    }

    public void postOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        postOrderTravesal(root.left);
        postOrderTravesal(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrderTravesal(TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> qu = new LinkedList();
        qu.offer(root);
        while(!qu.isEmpty()){
            TreeNode temp  =qu.poll();
            System.out.print(temp.data+" ");
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
    public int depthofTree(TreeNode temp){
        if(root ==null){
            return 0;
        }else{
            int leftHeight =0;int rightHeight =0;
            if(temp.left!=null){
                leftHeight= depthofTree(temp.left);
            }
            if(temp.right!=null){
                rightHeight= depthofTree(temp.right);
            }
            int max = (leftHeight>rightHeight)?leftHeight:rightHeight;
            return (max+1);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt =  new BinaryTree();
        bt.createTreeNode();
        bt.preOrderTravesal(bt.root);
        bt.levelOrderTravesal(bt.root);
        System.out.println();
        System.out.println(bt.isBalancedBinaryTree(bt.root));
        System.out.println(bt.depthofTree(bt.root));
        bt.inOrderTravesal(bt.root);
        System.out.println();
        bt.postOrderTravesal(bt.root);
    }


}

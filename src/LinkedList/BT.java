package LinkedList;

import java.util.Iterator;

// Cisco 4th Round Interview questions
public class BT
{
   public static Node root;
    static class Node{
        private int data;

        private Node left;

        private Node right;

        public Node(int data){
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node one  = new Node(1);
        Node two  = new Node(2);
        Node three  = new Node(3);
        Node four  = new Node(4);
        Node five  = new Node(5);
        Node six  = new Node(6);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        root =one;
        inorderTravesal(root);
    }

    public static void inorderTravesal(Node root){
        if(root ==null){
            return;
        }
        System.out.println(root.data);
        inorderTravesal(root.left);
        inorderTravesal(root.right);
    }



    /*
    Positive Scenarios
    1. Where root  !=null
    2. Binary Tree is Balanced or Levelled
    3.

    Negative Scenarios
    1. if root = null
    2. if its only root
    3. if it as only root.left Nodes
    4. if it as only root.right Nodes
    5. if it as only root.left.children.left Nodes
    6. it as only root.left.children.right Nodes
    7. if it as only root.right.children.left Nodes
    8. it as only root.right.children.right Nodes
    9. Not a balanced Binary Tree ( where the depth is varies more than 1)
    7.
    * */
/*
    7 horse racing track as only 4 (at a  tiome only 4 horse will run)
//    Iteration 1: 4 -> 1 2 3 4    1,2,3
//    Iteration 2: 4 -> 4 5 6 7    5,6,7  // 4 WIll be removed
//
//    Iteration 3: 4 -> 1,2,3,5   1,2
//    Iteration 4: 4 -> 5,6,7,3   5,6
//
//    Iterator 5:*/


}

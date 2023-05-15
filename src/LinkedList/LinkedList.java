package LinkedList;

public class LinkedList {

    static Node head=null;

    static class Node{
        private int a;
        private Node next;

        public Node(int a){
            this.a = a;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CreateNode(1);
        CreateNode(2);
        CreateNode(3);
        CreateNode(4);
        displayAllNode();
        reverseLinkedList();
        displayAllNode();
        arrageOddEvenLinkedList();
        displayAllNode();
    }
    public static void displayAllNode(){
        Node Current = head;
        while(Current!=null){
            System.out.println(Current.a);
            Current = Current.next;
        }

    }
    public static void CreateNode(int a){
        Node current  = null;
        if(head==null){
            head = new Node(a);
        }else{
            current =  head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = new Node(a);
        }
    }

    public static void reverseLinkedList(){
       Node Current =  head;
       Node prev =null;
       Node next = null;
       while(Current!=null){
           next = Current.next;
           Current.next =prev;
           prev =Current;
           Current = next;
       }
       head = prev;
    }

    public static void arrageOddEvenLinkedList(){
        Node current = head;
        Node odd=null;
        Node even = null;
        while(current!=null){
            if(current.a%2==0){
                if(even==null){
                    even = current;
                    even.next =null;
                }else{
                    Node temp =even;
                    temp.next = current;
                }
                current = current.next;
            }else{
                if(odd==null){
                    odd = current;
                }else{
                    Node temp =odd;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = current;
                }
                current = current.next;
            }
        }
        Node temp =odd;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = even;
        head = odd;
    }
}
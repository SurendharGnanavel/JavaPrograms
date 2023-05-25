package LinkedList;

public class LL1 {

    public static Node head;

    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void addNodeatLast(int data){
        if(head==null){
            head = new Node(data);
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public static Node lastNode(){
        if(head==null){
          return null;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
           return current;
        }
    }

    public static void displayAllNode(){
        Node current = head;
        Node prev =null;
        while(current!=null && prev !=head){
            System.out.println(current.data);
            current=current.next;
            prev =current;
        }
    }

    public static void main(String[] args) {
        addNodeatLast(1);
        addNodeatLast(2);
        addNodeatLast(3);
        addNodeatLast(4);
        addNodeatLast(5);
//        lastNode().next = head; /// for Circular LL
        displayAllNode();
        reverseLL();
        System.out.println("Reverse LL with head ==null");
        System.out.println("Reverse LL with out loop");
//        head=null;
        displayAllNode();

    }

    public static void reverseLL(){
        Node lastHead=head;
        Node prev=null;
        Node next=null;
        int c=0;
        while(head!=null){
            if(lastHead==head && c!=0){
               break;
            }
            next = head.next;
            head.next =prev;
            prev = head;
            head = next;
            c++;
        }
        head = prev;
    }
}

/*
1. if head=null
2. if LL dont have any loop
3. if LL has Multiple Loops
4. Check with N of inputs
5.
*/

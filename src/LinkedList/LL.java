package LinkedList;

public class LL {
    public static class Node{
        private int data;
        private Node next;

       public Node(int data){
            this.data =data;
        }
    }

    public static Node head;
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        head = one;
        head.next=two;
        addNodeatLast(3);
        addNodeatLast(4);
        addNodeatLast(5);
//        displayAllNode();
        addNodeatIndex(0,3);
        displayAllNode();
    }

    public static void addNodeatIndex(int data, int index){
        int count=1; Node next;
        if(head==null){
            head = new Node(data);
            count++;
        }else{
            Node current = head;
            while(current.next!=null){
                if(index==count) {
                   next = current.next;
                   current.next = new Node(data);
                   current.next.next =next;
                   break;
                }else{
                    current =current.next;
                }
                count++;
            }


        }

    }
    public static void addNodeatLast(int data){
        if(head==null){
            head = new Node(data);
        }else{
            Node current = head;
            while(current.next!=null){
                current =current.next;
            }
            current.next = new Node(data);
        }
    }

    public static void displayAllNode(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current =current.next;
        }
    }
}

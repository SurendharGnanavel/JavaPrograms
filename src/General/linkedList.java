package General;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll =  new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        // As LinkedList we have option to use the addFirst and addLast options
        ll.addFirst(0);
        ll.addLast(11);

        //to iterate from descending
        Iterator it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // To add element in the beginning
        ll.offerFirst(-1);

        // To Add Element at the end
        ll.offer(12);

        // LinkedList implements Queue and Stack
        // we can use Peek - Retrieve the first value of LinkedList
        System.out.println("First Element  --->"+ll.peek());
        // we can use Poll -  Retrieve the first and remove the value from the LinkedList
        System.out.println("Retrieve First Element and remove the Element --->"+ll.poll());

    }

}

package String;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }

    public static void reverseWords(String s){
        String[] s1 = s.split("\\s+");
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(s1));
        Iterator it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}

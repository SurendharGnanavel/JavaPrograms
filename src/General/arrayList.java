package General;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(1);
        // Predicate option to use in ArrayList
        Predicate<Integer> removeOdd = even->even%2 ==0;
        list.removeIf(removeOdd);
        list.stream().forEach(e-> System.out.println(e));

        // To get the lastIndex of the occurrence of Object
        System.out.println(list.lastIndexOf(1));


    }
}



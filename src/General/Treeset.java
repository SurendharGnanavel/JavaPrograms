package General;

import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(7);
        ts.add(8);
        ts.add(9);
        ts.add(11);

        // Ceiling is a function where it can return equal or close greatest element
        System.out.println(ts.ceiling(10));

        //Floor ----> is a function where it can return equal or close least element
        System.out.println(ts.floor(10));

        //DesendingSet --> iterate Elements in Descending Order
        System.out.println(ts.descendingSet());

        // HeadSet method return less than the given element
        System.out.println(ts.headSet(5));

        //Higher/Lower
        System.out.println(ts.higher(9));
        System.out.println(ts.lower(9));



    }
}

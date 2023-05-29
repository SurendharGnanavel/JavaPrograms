package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*@Cisco 5th Round Questions*/
public class ArrayListTest {

/*    set a = {1,2,3,4,5};
    set b = {1,2,7,8,9};

    outp: 3,4,5*/


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        List<Integer> lt = Arrays.stream(a).boxed().collect(Collectors.toList());
        int[] b= {1,2,8,9,10};
        List lt2= Arrays.stream(b).boxed().collect(Collectors.toList());
        lt.removeAll(lt2);
        lt.stream().forEach(System.out::println);
    }
}

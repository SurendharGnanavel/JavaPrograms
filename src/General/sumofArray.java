package General;

import java.util.ArrayList;


public class sumofArray {

    public static void main(String[] args){
        int[] a = {3,4,5,2,1,6,1,3};
        int sum  =6;
        sumofArrays(a,sum);
    }

    public static void sumofArrays(int[] a, int sum){
        ArrayList<Integer> intList = new ArrayList<>();
        for (int j : a) {
            int temp = sum - j;
            if (intList.contains(temp)) {
                System.out.println(j + "-----------" + temp);
            }
            intList.add(j);
        }
    }
}

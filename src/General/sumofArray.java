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
        for(int i=0;i<a.length;i++){
            int temp = sum-a[i];
            if(intList.contains(temp)){
                System.out.println(a[i]+"-----------"+temp);
            }
            intList.add(a[i]);
        }
    }
}

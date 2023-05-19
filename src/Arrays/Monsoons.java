package Arrays;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

//Cisco 2nd Round interview Questions
public class Monsoons {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Spring");
        tm.put(4,"Summer");
        tm.put(7,"Autumn");
        tm.put(10,"Winter");
        System.out.println(tm.get(tm.floorKey(3)));

        int a[] ={1,2,3,4,5};
        //5,1,2,3,4
        //4,5,1,2,3

        rotate(a,2);



    }

    public static void rotate(int[] a,int rotateNo){
        int[] b = new int[a.length];
        for(int i=0;i<rotateNo;i++) {
            for(int j=1;j<=a.length;j++) {
                if(j==a.length){
                   b[0] = a[a.length-1];
                }else{
                    b[j] = a[j - 1];
                }
            }

        }
        Arrays.stream(a).forEach(e->System.out.println(e));
    }

    ///


}

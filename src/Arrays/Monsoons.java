package Arrays;

import java.util.Arrays;
import java.util.TreeMap;


//Cisco 2nd Round interview Questions
public class Monsoons {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Spring");
        tm.put(4,"Summer");
        tm.put(7,"Autumn");
        tm.put(10,"Winter");
        System.out.println(tm.get(tm.floorKey(3)));

        int[] a ={1,2,3,4,5};
        //5,1,2,3,4
        //4,5,1,2,3

//        rotate(a,2);
        rotateArray(a,3);
        Arrays.stream(a).forEach(e-> System.out.println(e));


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
        Arrays.stream(a).forEach(System.out::println);
    }


    /// Rotate Array -> with help of Index we can able to rotate n no of times
    public static void rotateArray(int a[],int index){
        while(index>0) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
            index--;
        }

    }

    ///


}

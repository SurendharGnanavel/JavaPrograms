package General;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] a ={3,6,0,5};
//        bubbleSort(a);  // Run individually one by one
        insertionSort(a);
    }

    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int temp;
                if(a[i]<a[j]){  // if you change the grater than  to lesser than order will be Descending Order
                    temp = a[i];
                    a[i] =a[j];
                    a[j] =temp;
                }
            }
        }
        Arrays.stream(a).forEach(e-> System.out.println(e));  // Streams- > to do sout
    }

    public static void insertionSort(int[] a){
        int p=0;
        for(int i=0;i<a.length;i++){
            int temp  = a[i];
            for(int j=i;j<a.length;j++){
                if(temp>a[j]){
                    temp = a[j];
                    p=j;
                }
            }
            a[p] = a[i];
            a[i] =temp;
        }
        Arrays.stream(a).forEach(e-> System.out.println(e));  // Streams- > to do sout
    }
}

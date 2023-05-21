package Arrays;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] a = {3,6,8,10,12};
        int [] b = {1,4,7,9,11,15,21};
        int[] c =mergeSort(a,b);
        Arrays.stream(c).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] a,int[] b){
        int alen = a.length;
        int blen = b.length;
        int [] c = new int[alen+blen];
        int i=0,j=0 ,k =0;
        while (alen>i && blen>j){
            if(a[i]>b[j]){
                c[k++] = b[j++];
            }else{
                c[k++] = a[i++];
            }
        }
        while(alen>i){
            c[k++] = a[i++];
        }
        while(blen>j){
            c[k++] = b[j++];
        }
        return c;
    }
}

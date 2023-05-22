package Arrays;

import java.util.Arrays;
import java.util.TreeSet;


//Walmart 1st round interview questions
public class ArrayManipulation {


    /*given array need to shuffle even/odd or odd/even type*/
    public static void main1(String[] args) {
//        int[] a = {2, 5 , -6, -1,};
        int[] a = {2, 5 ,-8, -6, -1,5};
        int[] c =new int[a.length];
        int temp;
        for(int i=0;i<a.length;i++) {
            if(a[i]>0){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<0){
                        temp = a[i+1];
                        a[i+1] =a[j];
                        a[j]= temp;
                        break;
                    }
                }
            }else{
                for(int j=i+1;j<a.length;j++){
                    if(a[j]>0){
                        temp = a[i+1];
                        a[i+1] =a[j];
                        a[j]= temp;
                        break;
                    }
                }
            }
        }
        Arrays.stream(a).forEach(System.out::print);

    }


    /*Given array need to find maximum difference and consolidate with overall */
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int temp=0;
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> tempts = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++) {
                if (a[i] < a[j]) {
                    tempts.add(a[i]-a[j]);
                }
            }
             if(!tempts.isEmpty()){
                 ts.add(tempts.first());
             }
            tempts.clear();
        }
        System.out.println(ts.first());

    }

}

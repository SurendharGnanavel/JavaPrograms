package Arrays;

import General.Treeset;

import java.util.*;
///Cisco Interview
public class get3rdLargestElement {

    public static void main(String[] args) {
        int [] a = {10, 9, 12, 1, 0, 2, -1, 9, 8, 10};
        int [] a1 = {1,10, 9, 12, 1, 0, 2, -1, 9, 8, 10};
        int index = 3;
//        System.out.println(returnlargestElement(a,index));
//        System.out.println(returnlargest(a,index));
//        findLargest(a1);
        findlargestwithIndex(a1,3);
    }


    public static int returnlargestElement(int[] a, int index){
        TreeSet<Integer> ts = new TreeSet<>();
        Arrays.stream(a).forEach(e->ts.add(e));
        LinkedList<Integer> ll = new LinkedList<>(ts);
        return ll.get(ll.size()-index);
    }

    public static int returnlargest(int a[],int index){
        ArrayList<Integer> al =new ArrayList<>();
                Arrays.stream(a).forEach(e->al.add(e));
        Collections.sort(al);
        return al.get(al.size()- index);

    }

    public static int findLargest(int[] a){
        int temp;
        for(int i=0;i<a.length-1;i++){
            temp = a[i];
            if(temp>a[i+1]){
                temp = a[i+1];
                a[i+1]= a[i];
                a[i] =temp;
            }
        }
       return a[a.length-1];
    }


    public static void findlargestwithIndex(int [] a,int index){
        int prev =0,current;
        while(index>0){
           current =  findLargest(a);
           if(current ==prev){

           }else{
               prev = current;
               index--;
           }
           if(!(index==0)) {
               a[a.length - 1] = 0;
           }
        }
        System.out.println(a[a.length-1]);

    }








}

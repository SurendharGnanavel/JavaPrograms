package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(binarySearch(a,0,a.length-1,-2));
    }

    public static int binarySearch(int [] a, int start, int end, int key){
        if(end>=start) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            }else if(mid==end){
                return a[mid]>key ? ((mid)==0?0:(mid-1)):mid+1;
            } else if (key > a[mid]) {
                return binarySearch(a, mid + 1, end, key);
            } else {
                return binarySearch(a, 0, mid - 1, key);
            }
        }
        return -1;
    }
}

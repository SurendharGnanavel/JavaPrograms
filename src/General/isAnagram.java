package General;

import java.util.Arrays;

public class isAnagram {


    public static boolean isanagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        if (c1.length != c2.length) {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}

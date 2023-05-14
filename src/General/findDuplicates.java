package General;

import java.util.Arrays;

public class findDuplicates {
    public static int[] counter  = new int[255];
    public static int count=0;



    public static void main(String[] args) {
            findDulipcates("Selenium");
    }

    public static void findDulipcates(String s){
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i)]++;
        }
        Arrays.stream(counter).forEach(e->{
            count++;
            if(e>1){
                System.out.println((char) (count-1)+"-------------->"+e);
            }
        });
    }

}

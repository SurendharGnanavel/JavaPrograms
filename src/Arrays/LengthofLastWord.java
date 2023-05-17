package Arrays;

public class LengthofLastWord {
    public static void main(String[] args) {
        String a = "Hello World";
        findLastStringLength(a);
    }

    public static void findLastStringLength(String s){
        String[] s1 = s.split("\\s+");
        System.out.println(s1[s1.length-1].length());

    }
}

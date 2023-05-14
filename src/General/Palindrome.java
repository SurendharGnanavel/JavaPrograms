package General;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("and"));
        System.out.println(isPalindromeList("0"));
    }

    public static boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        String reverseString = sb.reverse().toString();
        return reverseString.equals(s);
    }

    public static boolean isPalindromeList(String s){
        ArrayList<Character> charList = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if(charList.contains(s.charAt(i))){
                charList.remove((Character) s.charAt(i));
            }else{
                charList.add(s.charAt(i));
            }
        }
        return ((charList.isEmpty() && s.length() % 2 == 0)) || (charList.size() == 1 && s.length() % 2 == 1);
    }
}

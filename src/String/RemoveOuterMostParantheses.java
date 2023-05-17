package String;

import java.util.*;

public class RemoveOuterMostParantheses {
    public static void main(String[] args) {
        String a = "(()())(())";
        removeouterParantheses(a);
    }

    public static void removeouterParantheses(String s){
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0;i<s.length();i++) {
                if(st.isEmpty()){
                    st.add(s.charAt(i));
                }else if(s.charAt(i)=='(' && st.getLast()!='('){
                    st.add(s.charAt(i));
                } else if (s.charAt(i)==')' && st.getLast()!=')') {
                    st.add(s.charAt(i));
                }else{
                    if(s.charAt(i)!=')') {
                        st.pollLast();
                        st.add(s.charAt(i));
                    }
                }
            }
        st.stream().forEach(e-> System.out.print(e));

    }

}

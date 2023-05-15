package General;

import java.util.Stack;

public class BalancedParanthisis {

    public static void main(String[] args) {
        String  randomString = "{skjdbaskfb(akbndcasjkfnafja[dbasdjkasbdfjkbfdfdfasffadsf]jkhdbasdfiasjbf)asdjkfbnasdfjiikaDF}";
        System.out.println(isBalanced(randomString));
    }

    public static boolean isBalanced(String randomString){
        Stack<Character> st =  new Stack<>();
        String s = randomString.replaceAll("[0-9a-zA-Z]","");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{'||c=='('||c=='['){
                st.push(c);
            }else{
                switch(c){
                    case ')':
                        if(st.lastElement() == '('){
                            st.pop();
                        }else{
                            return false;
                        }
                        break;
                    case '}':
                        if(st.lastElement() == '{'){
                            st.pop();
                        }else{
                            return false;
                        }
                        break;
                    case']':
                        if(st.lastElement() == '['){
                            st.pop();
                        }else{
                            return false;
                        }
                        break;
                    default:
                        return false;

                }

            }
        }
        return st.isEmpty();
    }
}

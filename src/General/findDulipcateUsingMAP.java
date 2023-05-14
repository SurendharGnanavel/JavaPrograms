package General;

import java.util.HashMap;
import java.util.Map;

public class findDulipcateUsingMAP {
    public static void main(String[] args) {
        findDulipcates("Peekking");
    }
    public static void findDulipcates(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        map.entrySet().forEach(e->{
            if(map.get(e.getKey())>1){
                System.out.println(e.getKey()+"--------->"+e.getValue());
            }
        });
    }
}

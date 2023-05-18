package String;


import java.util.TreeMap;

public class Integer2Roman {

    public static void main(String[] args) {
        integer2Roman(5);
    }

    public static void integer2Roman(int a){
        TreeMap<Integer,String> int2Roman = new TreeMap<>();
        int2Roman.put(1,"I");
        int2Roman.put(5,"V");
        int2Roman.put(10,"X");
        int2Roman.put(50,"L");
        int2Roman.put(100,"C");
        int2Roman.put(500,"D");
        int2Roman.put(1000,"M");
        if(int2Roman.containsKey(a)){
            System.out.println(int2Roman.get(a));
        }
        int temp =a;
        while(temp>0){
            int greaterKey = int2Roman.ceilingKey(a);
            int smallerKey = int2Roman.floorKey(a);
            if (int2Roman.containsKey(a + 1)) {

            }
        }
    }

}

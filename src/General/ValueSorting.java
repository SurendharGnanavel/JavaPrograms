package General;

import java.util.*;

public class ValueSorting {

    public static void main(String[] args) {
        Map<String, String> PersonDetails = new HashMap<>();
        PersonDetails.put("Suren","Morgan Stanley");
        PersonDetails.put("Siva","Tata");
        PersonDetails.put("Mohan","Cognizant");
        ValueSorting(PersonDetails);
    }

    public static void ValueSorting(Map<String,String> map){
        LinkedList list =  new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) o1).getValue()).compareTo(((Map.Entry) o2).getValue());
            }
        });
        Map<String,String> map1 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            map1.put(String.valueOf(me.getKey()),String.valueOf(me.getValue()));
        }
        map1.entrySet().forEach(e->{
            System.out.println(e.getKey()+"------------->"+e.getValue());
        });

    }
}

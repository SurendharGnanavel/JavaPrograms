package General;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeySorting {

    public static void main(String[] args) {
        Map<String, String> PersonDetails = new HashMap<>();
        PersonDetails.put("Suren","Morgan Stanley");
        PersonDetails.put("Siva","Tata");
        PersonDetails.put("Mohan","Cognizant");
        valueSorting(PersonDetails);
    }

    public static void valueSorting(Map map){
        TreeMap<String,String> tMap =  new TreeMap(map);
        tMap.entrySet().forEach(e->{
            System.out.println(e.getKey()+"----------------->"+e.getValue());
        });
    }
}

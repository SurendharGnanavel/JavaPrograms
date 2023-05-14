package General;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Serlization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String, String> PersonDetails = new HashMap<>();
        PersonDetails.put("Suren","Morgan Stanley");
        PersonDetails.put("Siva","Tata");
        PersonDetails.put("Mohan","Cognizant");
        serlizer(PersonDetails);
        deserlizer();
    }

    public static void serlizer(Map personalDetails) throws IOException {
        FileOutputStream fos =  new FileOutputStream("out.serr");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(personalDetails);
        fos.close();
        ous.close();
    }

    public static void deserlizer() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(new File("out.serr"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String,String > map = (Map) ois.readObject();
        map.entrySet().forEach(e->{
            System.out.println(e.getKey()+"-------------"+e.getValue());
        });
    }
}

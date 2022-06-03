package lv.lu.training.lessson9;

import java.util.HashMap;
import java.util.Map;

public class PlayWithHashMap {


    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("Bob", "555-1234");
        contacts.put("Anna", "555-654");

        System.out.println(contacts);
        System.out.println(contacts.entrySet());

        for(Map.Entry<String, String > entry: contacts.entrySet()){
            System.out.println(
                    entry.getKey()+ "   "+ entry.getValue()
            );
        }
    }
}

package horaDaPratica.arrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Cats");
        map.put(2,"Dogs");
        map.put(3,"Pigs");
        map.put(4,"Sheep");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.get(1));
        for(Integer key: map.keySet()){
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
        }
    }
}

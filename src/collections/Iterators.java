package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        //Most common use
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        //Use with Map
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        var j = fruitCalories.entrySet().iterator();
        while(j.hasNext()) {
            var next = j.next();
            System.out.println("this is next : " + next);
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

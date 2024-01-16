package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachAndLambdas {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);

        printMap_forEach();
    }

    public static void printMap_forEach() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        fruitCalories.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}

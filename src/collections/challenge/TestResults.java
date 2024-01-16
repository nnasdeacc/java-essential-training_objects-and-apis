package collections.challenge;

import java.util.HashMap;
import java.util.Map;

public class TestResults {


    public static void main(String[] args) {
        makeFinalGrades(getOriginalGrades(), getMakeUpGrades())
                .entrySet()
                .forEach(System.out::println);

    }

    public static Map<String, Integer> makeFinalGrades(Map<String, Integer> originalGrades, Map<String, Integer> makeUpGrades) {
        Map<String, Integer> grades = new HashMap<>();
        originalGrades.forEach((k, v) -> {
            if(v < makeUpGrades.get(k)) {
                grades.put(k, getMakeUpGrades().get(k));
            } else {
                grades.put(k, v);
            }
        });
        return grades;
    }
    public static Map<String, Integer> getOriginalGrades(){
//        Map grades = new HashMap();
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map<String, Integer> getMakeUpGrades(){
//        Map grades = new HashMap();
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }
}
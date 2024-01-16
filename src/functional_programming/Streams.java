package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 4, 6, 8, 10};
        Arrays.stream(numbers).parallel()
                .forEach(n -> System.out.print(n + 1 + " " +"\n"));

        List<String> veggies = List.of(
                "spinach",
                "cabbage",
                "peas",
                "brussels sprouts",
                "carrots"
        );
        //anyMatch = Terminal
        veggies.stream().anyMatch(v -> v.contains(" ")); // the condition is in the form of a Predicate
        //allMatch = Terminal
        veggies.stream().allMatch(v -> v.contains("s")); // the condition is in the form of a Predicate
        //filter = Intermediate
        veggies.stream().filter(v -> v.startsWith("c"))
                //forEach = Terminal
                .forEach(System.out::println);

        //This Stream method lets you manipulate data
        //map = resulting stream
        veggies.stream()
                .map(String::toUpperCase) // .map() accepts a function
                .forEach(System.out::println);

        List<Integer> numbersAgain = List.of(2, 4, 6, 8, 10);
        System.out.println(
        numbersAgain.stream()
                .reduce(0, (a,b) ->a+b)
                // params: initial value to start from (identity) and
                // a binary operator used to accumulate the values
        );
        System.out.println(
                veggies.stream()
                        .sorted()
                        .reduce("", (a, b) -> a + " | " + b)
                        // reduce also works with Strings
        );

        List veggiesThatEndWithS = veggies.stream()
                        .filter(v->v.endsWith("s"))
                                .collect(Collectors.toList());
        veggiesThatEndWithS.forEach(System.out::println);

        veggies.stream()
                .sorted()
                .filter(v->v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v->v.transform(w->"yummy " + w))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

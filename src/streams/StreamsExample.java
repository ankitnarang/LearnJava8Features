package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,10,15,20,25,30,35,40);
        System.out.println("List is " + list);
        List<Integer> result = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println("Resulting list is " + result);
        result = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println("After doubling each item in list, resulting list is " + result);

        List<String> names = List.of("Mike","Joe","Tom","John","Lily");
        List<String> resultingNames = names
                                .stream()
                                .filter(s -> s.length() == 3)
                                .map(s -> s.toUpperCase())
                                .collect(Collectors.toList());
        System.out.println(resultingNames);

        long countOfNames = names.stream()
                                .filter(str -> str.length() == 3)
                                .count();

        System.out.println(countOfNames);

        List<Integer> resultOfSortedNumbers = Stream
                .of(45,23,67,12,89,101,11,54,9)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultOfSortedNumbers);

        List<Integer> resultOfReverseSortedNumbers = Stream
                .of(45,23,67,12,89,101,11,54,9)
                .sorted((i1,i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(resultOfReverseSortedNumbers);

        Integer minimumNumber = Stream
                                    .of(45,23,67,12,89,101,11,54,9)
                                    .min((i1,i2) -> i1.compareTo(i2))
                                    .get();
        System.out.println(minimumNumber);

        Integer maximumNumber = Stream
                .of(45,23,67,12,89,101,11,54,9)
                .max((i1,i2) -> i1.compareTo(i2))
                .get();
        System.out.println(maximumNumber);

        Stream
                .of("Cat","Dog","Monkey","Tiger","Lion")
                .forEach( s -> System.out.print(s + " "));

        System.out.println();

        Stream
                .of("Cat ","Dog ","Monkey ","Tiger ","Lion ")
                .forEach(System.out::print);

        String[] resultArray = Stream
                .of("Joe","Doe","Moe")
                .toArray(String[]::new);

        System.out.println("\n\nUsing String array ");
        for (String str : resultArray){
            System.out.print(str + " ");
        }
    }
}

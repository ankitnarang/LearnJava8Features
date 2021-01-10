package javautilfunctionalinterfaces;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        int[] numbers = {0,5,10,15,20,25,30};
        Predicate<Integer> greaterThanPredicate = x -> x >= 10;
        Predicate<Integer> evenNumberPredicate = x -> x%2 == 0;

        System.out.println("The numbers greater than 10 are ");
        method(greaterThanPredicate,numbers);
        System.out.println();

        System.out.println("The even numbers are ");
        method(evenNumberPredicate,numbers);
        System.out.println();

        System.out.println("The numbers less than 10 are ");
        method(greaterThanPredicate.negate(),numbers);
        System.out.println();

        System.out.println("The numbers greater than 10 and even are ");
        method(greaterThanPredicate.and(evenNumberPredicate),numbers);
        System.out.println();

        System.out.println("The numbers greater than 10 or even are ");
        method(greaterThanPredicate.or(evenNumberPredicate),numbers);
        System.out.println();
    }

    private static void method(Predicate<Integer> predicate, int[] numbers) {
        for(int num : numbers){
            if(predicate.test(num)){
                System.out.print(num + " ");
            }
        }
    }
}

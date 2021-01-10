package javautilfunctionalinterfaces;

import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        Predicate<Integer> i = x -> x > 10;
        System.out.println("Is 30 greater than 10 ? " + i.test(30));
        System.out.println("Is 5 greater than 10 ? " + i.test(5));
    }
}

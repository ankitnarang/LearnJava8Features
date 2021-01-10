package javautilfunctionalinterfaces;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        String str = "Ankit";
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply(str));

        str = "cat";
        System.out.println(f.apply(str));

    }
}

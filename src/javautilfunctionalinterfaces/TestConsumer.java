package javautilfunctionalinterfaces;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Ankit");
    }
}

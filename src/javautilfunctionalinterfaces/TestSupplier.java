package javautilfunctionalinterfaces;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String[] array = {"Bill","Joe","John","Mike","Tom"};
            int random = (int)(Math.random() * 5);
            return array[random];
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}

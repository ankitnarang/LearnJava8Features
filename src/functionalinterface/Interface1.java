package functionalinterface;

@FunctionalInterface
public interface Interface1 {
    public void method1();

    default void method2() {

    }

    static void method3() {

    }

}

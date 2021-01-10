package methodreference;

public class MainClass {

    public static void main(String[] args) {
        Interface1 i = MainClass::method1; // Lambda expression is replaced with Method Reference
        i.method();
    }

    public static void method1() {
        System.out.println("This is example of method reference");
    }
}

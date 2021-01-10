package defaultmethods;

public class MainClass implements Interface1,Interface2 {

    @Override
    public void method() {
        System.out.println("This is overridden implementation of default class");
        Interface1.super.method();
        Interface2.super.method();
    }

    public static void main(String[] args) {
        Interface1 obj = new MainClass();
        obj.method();
    }
}

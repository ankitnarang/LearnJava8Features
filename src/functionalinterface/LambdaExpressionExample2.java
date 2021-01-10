package functionalinterface;

public class LambdaExpressionExample2 {
    int x = 10;

    public void method(){
        int y = 20;
        Interface1 i = () -> {
            //y = y + 10; Compiler Error :  variable used in lambda expression should be final or effectively final
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            x = x + 40;
            System.out.println("now x = " + x);
        };
        i.method1();
    }

    public static void main(String[] args) {
        new LambdaExpressionExample2().method();
    }
}

package functionalinterface;

public class MainClass {
    public static void main(String[] args) {
        /*
        InterfaceAdd obj = (a , b) -> (a + b);
        int result = obj.add(10,20);
        System.out.println("Result is " + result);

        obj = (a, b) -> 4 * a * b;
        result = obj.add(10,10);
        System.out.println("Result is " + result);

        InterfaceSquare squareObject = (x) -> x * x;
        System.out.println("Square of 10 is " + squareObject.square(10));
        System.out.println("Square of 89 is " + squareObject.square(89));
        System.out.println("Square of 25 is " + squareObject.square(25));
        */

        Runnable r = () -> {
            for (int i = 0; i < 10; i++){
                System.out.println("Child Thread " + i);
            }
        };

        Thread thread1 = new Thread(r);
        thread1.start();

        for (int i = 0; i < 10; i++){
            System.out.println("Main Thread " + i);
        }

    }
}

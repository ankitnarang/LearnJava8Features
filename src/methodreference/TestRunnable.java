package methodreference;

public class TestRunnable {
    public void method(){
        for(int i = 0; i < 10; i++){
            System.out.println("Child Thread " + i);
        }
    }
    public static void main(String[] args) {
        TestRunnable object = new TestRunnable();
        Runnable r = object::method;
        Thread thread = new Thread(r);
        thread.start();

        System.out.println();

        for(int i = 0; i < 10; i++){
            System.out.println("Main Thread " + i);
        }

    }
}

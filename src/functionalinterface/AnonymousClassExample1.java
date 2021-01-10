package functionalinterface;

public class AnonymousClassExample1 {
    int x = 888;

    public void method(){
        Interface1 i = new Interface1() {
            int x = 999;
            @Override
            public void method1() {
                System.out.println("x = " + this.x + " global x = " + new AnonymousClassExample1().x);
            }
        };
        i.method1();
    }

    public static void main(String[] args) {
        AnonymousClassExample1 object = new AnonymousClassExample1();
        object.method();
    }

}

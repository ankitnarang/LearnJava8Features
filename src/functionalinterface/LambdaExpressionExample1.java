package functionalinterface;

public class LambdaExpressionExample1 {

    int x = 888;

    public void method(){
        Interface1 i = () -> {
                int x = 999;
                System.out.println("x = " + this.x + " local x = " + x);
        };
        i.method1();
    }

    public static void main(String[] args) {
        LambdaExpressionExample1 object = new LambdaExpressionExample1();
        object.method();
    }

}

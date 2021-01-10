package lambdaexpressions;

public class LearnLambdaExpressions {
    public static void main(String[] args) {
        LearnLambdaExpressions obj = new LearnLambdaExpressions();
        obj.method();
        Runnable r = () -> System.out.println("Hello");
        r.run();
        //(int a, int b) -> System.out.println(a + b);
        // (String s ) -> System.out.println(s.length());
    }

    public void method(){
        System.out.println("Hello");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }

    public int getLength(String s){
        return s.length();
    }

}

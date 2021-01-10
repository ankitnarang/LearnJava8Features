package defaultmethods;

public interface Interface1 {
    default void method(){
        System.out.println("This is default method of interface 1");
    }
}

package methodreference;

public class TestConstructorReference {
    public static void main(String[] args) {
        Interface2 i = Sample::new;
        Sample s = i.get();
    }
}
class Sample{
    public Sample() {
        System.out.println("This is example of constructor reference");
    }
}

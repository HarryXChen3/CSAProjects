package sandbox.inheritance;

public class Test extends Inherited {
    public void tested() {
        System.out.print("up");
    }

    public void test() {
        tested();
        super.test();
        super.tested();
    }

    public static void main(final String[] args) {
        final Test test = new Test();
        test.test();
    }
}

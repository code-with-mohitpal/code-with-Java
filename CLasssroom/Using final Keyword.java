final class Test {
    final int value = 100;

    final void show() {
        System.out.println("Final Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println(t.value);
    }
}

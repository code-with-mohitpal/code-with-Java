interface Demo {

    void display();

    default void message() {
        System.out.println("Default Method");
    }

    static void info() {
        System.out.println("Static Method");
    }
}

class Test implements Demo {

    public void display() {
        System.out.println("Display Method");
    }
}

public class Main {
    public static void main(String[] args) {

        Test t = new Test();

        t.display();
        t.message();

        Demo.info();
    }
}

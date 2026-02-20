class Parent {
    Parent(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(10);   // Must call parent constructor
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

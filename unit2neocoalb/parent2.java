class Parent2 {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent2 {
    void show() {   // Method Overriding
        System.out.println("Child method");
    }

    void display() {
        show();        // Calls child method
        super.show();  // Calls parent method
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

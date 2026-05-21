@FunctionalInterface
interface MyInterface {
    void display();
}

class Main {
    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Functional Interface Example");
        };

        obj.display();
    }
}

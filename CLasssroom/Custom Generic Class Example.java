class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();

        b1.setValue("Java Generics");

        System.out.println(b1.getValue());
    }
}

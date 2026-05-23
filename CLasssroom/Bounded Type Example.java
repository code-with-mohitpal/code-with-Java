class Calculator<T extends Number> {

    T num;

    Calculator(T num) {
        this.num = num;
    }

    double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {

        Calculator<Integer> c1 = new Calculator<>(5);

        System.out.println("Square: " + c1.square());
    }
}

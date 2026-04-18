class NumberComparator<T extends Comparable<T>> {

    private T num1;
    private T num2;

    public NumberComparator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String compare() {
        int result = num1.compareTo(num2);

        if (result > 0) {
            return "First number is greater";
        } else if (result < 0) {
            return "First number is smaller";
        } else {
            return "Both numbers are equal";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        NumberComparator<Integer> obj1 = new NumberComparator<>(10, 20);
        System.out.println(obj1.compare());

        NumberComparator<Double> obj2 = new NumberComparator<>(15.5, 15.5);
        System.out.println(obj2.compare());
    }
}

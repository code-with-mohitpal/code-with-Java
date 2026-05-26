import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);
    }
}

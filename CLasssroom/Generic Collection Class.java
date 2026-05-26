import java.util.ArrayList;

class Box<T> {

    ArrayList<T> list = new ArrayList<>();

    void add(T value) {
        list.add(value);
    }

    void display() {
        System.out.println(list);
    }
}

class Main {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>();

        b1.add(10);
        b1.add(20);

        b1.display();
    }
}

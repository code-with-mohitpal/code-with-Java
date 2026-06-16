class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println(first + " " + second);
    }
}

class Main {
    public static void main(String[] args) {

        Pair<Integer, String> p =
                new Pair<>(101, "Mohit");

        p.display();
    }
}

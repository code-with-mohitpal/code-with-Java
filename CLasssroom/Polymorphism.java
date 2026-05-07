class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Addition obj = new Addition();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(5.5, 2.5));
    }
}

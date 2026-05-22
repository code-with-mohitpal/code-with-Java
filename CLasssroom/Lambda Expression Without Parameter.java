interface Greeting {
    void message();
}

class Main {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Good Morning");

        g.message();
    }
}

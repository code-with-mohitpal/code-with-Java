class Demo {

    <T> void display(T value) {
        System.out.println(value);
    }
}

class Main {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display(100);
        d.display("Java");
    }
}

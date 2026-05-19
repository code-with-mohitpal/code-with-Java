class Animal {
}

class Cat extends Animal {
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();

        System.out.println(c instanceof Cat);
        System.out.println(c instanceof Animal);
    }
}

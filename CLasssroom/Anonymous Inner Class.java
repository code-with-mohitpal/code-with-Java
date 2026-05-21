abstract class Animal {
    abstract void sound();
}

class Demo {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog Barks");
            }
        };

        a.sound();
    }
}

class Outer {

    void outerMethod() {
        System.out.println("Outer Class Method");
    }

    class Inner {
        void display() {
            outerMethod();
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}

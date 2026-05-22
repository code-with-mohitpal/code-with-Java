class Outer {

    static int number = 100;

    static class Inner {
        void show() {
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}

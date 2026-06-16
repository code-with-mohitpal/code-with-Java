class Outer {
    private String msg = "Hello from Outer Class";

    class Inner {
        void show() {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.show();
    }
}

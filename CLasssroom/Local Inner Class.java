class Test {

    void display() {

        class LocalInner {
            void message() {
                System.out.println("Local Inner Class");
            }
        }

        LocalInner obj = new LocalInner();
        obj.message();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}

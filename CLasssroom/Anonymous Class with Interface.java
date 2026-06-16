interface Message {
    void show();
}

class Demo {
    public static void main(String[] args) {

        Message m = new Message() {
            public void show() {
                System.out.println("Anonymous Interface Class");
            }
        };

        m.show();
    }
}

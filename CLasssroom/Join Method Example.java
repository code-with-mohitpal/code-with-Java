class JoinDemo extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();

        try {
            t1.join();
        } catch(Exception e) {}

        t2.start();
    }
}

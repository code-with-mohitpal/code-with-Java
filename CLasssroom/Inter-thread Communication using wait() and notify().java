class Shared {
    synchronized void print() {
        try {
            System.out.println("Waiting...");
            wait();

            System.out.println("Notified!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    synchronized void notifyThread() {
        notify();
    }
}

public class InterThread {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.print());

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch(Exception e) {}

            obj.notifyThread();
        });

        t1.start();
        t2.start();
    }
}

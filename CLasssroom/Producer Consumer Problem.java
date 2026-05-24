class Company {
    int n;
    boolean valueSet = false;

    synchronized void produce(int n) {
        while(valueSet) {
            try {
                wait();
            } catch(Exception e) {}
        }

        this.n = n;
        System.out.println("Produced: " + n);

        valueSet = true;
        notify();
    }

    synchronized void consume() {
        while(!valueSet) {
            try {
                wait();
            } catch(Exception e) {}
        }

        System.out.println("Consumed: " + n);

        valueSet = false;
        notify();
    }
}

class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            c.produce(i);
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            c.consume();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Company c = new Company();

        Producer p = new Producer(c);
        Consumer con = new Consumer(c);

        p.start();
        con.start();
    }
}

class LifeCycle extends Thread {
    public void run() {
        System.out.println("Thread state inside run: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        LifeCycle t1 = new LifeCycle();

        System.out.println("State after creation: " + t1.getState());

        t1.start();

        System.out.println("State after start: " + t1.getState());
    }
}

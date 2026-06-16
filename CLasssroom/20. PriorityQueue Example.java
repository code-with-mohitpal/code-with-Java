import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
    }
}

class Node7 {
    int data;
    Node7 next;
    Node7(int data) {
        this.data = data;
    }
}

public class CountNodes {
    static Node7 head;

    static int count() {
        int c = 0;
        Node7 temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        head = new Node7(10);
        head.next = new Node7(20);
        head.next.next = new Node7(30);

        System.out.println(count());
    }
}

class Node9 {
    int data;
    Node9 next;
    Node9(int data) {
        this.data = data;
    }
}

public class MiddleElement {
    static Node9 head;

    static void findMiddle() {
        Node9 slow = head;
        Node9 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        head = new Node9(10);
        head.next = new Node9(20);
        head.next.next = new Node9(30);
        head.next.next.next = new Node9(40);

        findMiddle();
    }
}

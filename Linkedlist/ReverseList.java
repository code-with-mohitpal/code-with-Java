class Node8 {
    int data;
    Node8 next;
    Node8(int data) {
        this.data = data;
    }
}

public class ReverseList {
    static Node8 head;

    static void reverse() {
        Node8 prev = null;
        Node8 curr = head;
        Node8 next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        head = new Node8(10);
        head.next = new Node8(20);
        head.next.next = new Node8(30);

        reverse();

        Node8 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

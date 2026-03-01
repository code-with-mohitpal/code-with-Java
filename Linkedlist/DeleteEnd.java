class Node5 {
    int data;
    Node5 next;
    Node5(int data) {
        this.data = data;
    }
}

public class DeleteEnd {
    static Node5 head;

    static void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node5 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        head = new Node5(10);
        head.next = new Node5(20);
        head.next.next = new Node5(30);

        deleteEnd();

        Node5 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
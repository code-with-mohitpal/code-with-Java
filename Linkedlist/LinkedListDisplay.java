class Node1 {
    int data;
    Node1 next;
    Node1(int data) {
        this.data = data;
    }
}

public class LinkedListDisplay {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);

        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

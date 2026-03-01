class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
    }
}

public class InsertEnd {
    static Node3 head;

    static void insertEnd(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);

        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
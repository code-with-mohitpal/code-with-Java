class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
    }
}

public class InsertBeginning {
    static Node2 head;

    static void insert(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(10);

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

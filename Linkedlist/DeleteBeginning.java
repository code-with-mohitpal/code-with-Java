class Node4 {
    int data;
    Node4 next;
    Node4(int data) {
        this.data = data;
    }
}

public class DeleteBeginning {
    static Node4 head;

    static void deleteBegin() {
        if (head != null) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        head = new Node4(10);
        head.next = new Node4(20);
        head.next.next = new Node4(30);

        deleteBegin();

        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

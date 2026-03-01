class Node6 {
    int data;
    Node6 next;
    Node6(int data) {
        this.data = data;
    }
}

public class SearchElement {
    static Node6 head;

    static boolean search(int key) {
        Node6 temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node6(10);
        head.next = new Node6(20);
        head.next.next = new Node6(30);

        System.out.println(search(20));
    }
}

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);
    }
}

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Mohit");
        names.add("Rahul");
        names.add("Aman");

        System.out.println(names);

        for(String s : names) {
            System.out.println(s);
        }
    }
}

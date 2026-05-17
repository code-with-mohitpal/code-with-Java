public class StringExample {
    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb);
    }
}

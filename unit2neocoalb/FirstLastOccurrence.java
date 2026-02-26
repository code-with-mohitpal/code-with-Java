import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);
        
        System.out.println("First Position: " + first);
        System.out.println("Last Position: " + last);
    }
}

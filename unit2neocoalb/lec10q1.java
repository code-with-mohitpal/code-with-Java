import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            Day today = Day.valueOf(input.toUpperCase());
            Day[] days = Day.values();
            int nextIndex = (today.ordinal() + 1) % days.length;
            System.out.println(days[nextIndex]);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }
    }
}

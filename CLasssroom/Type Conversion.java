import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as string: ");
        String str = sc.nextLine();

        int numInt = Integer.parseInt(str);
        float numFloat = Float.parseFloat(str);
        String numString = String.valueOf(numInt);

        System.out.println(numInt + " -> " + ((Object)numInt).getClass().getSimpleName());
        System.out.println(numFloat + " -> " + ((Object)numFloat).getClass().getSimpleName());
        System.out.println(numString + " -> " + numString.getClass().getSimpleName());
    }
}

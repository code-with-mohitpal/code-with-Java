import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float gst = total * 0.18f;
        float finalBill = total + gst;

        System.out.println("Total Bill with GST = " + finalBill);
    }
}


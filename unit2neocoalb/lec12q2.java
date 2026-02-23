// Single File Programming Question
// Problem Statement



// Meera is developing a simple billing system for a stationery shop.

// She wants to calculate the total cost and discounted cost of items using constructor overloading.



// The program should define a class named BillCalculator with two constructors:

//     • Constructor with one parameter: Initializes the price of a single item and assumes the quantity as 1.

//     • Constructor with two parameters: Initializes both the price of the item and the quantity purchased.



// Calculation Rules



// Total Cost = price × quantity
// If the total cost is greater than 500, apply a 10% discount
// Otherwise, no discount is applied
// Input format :
// The first line of input consists of an integer p, representing the price of the item.

// The second line of input consists of an integer q, representing the quantity of items.

// Output format :
// The first line of output prints an integer representing the total cost.

// The second line of output prints an integer representing the final amount after discount.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given testcases fall under the following constraints:

// 1 ≤ p ≤ 1000

// 1 ≤ q ≤ 20

// Sample test cases :
// Input 1 :
// 10
// 5
// Output 1 :
// 50
// 50
// Input 2 :
// 100
// 6
// Output 2 :
// 600
// 540
// Note :




import java.util.Scanner;

class BillCalculator {
    int price;
    int quantity;
    int totalCost;
    int finalAmount;

    BillCalculator(int price) {
        this.price = price;
        this.quantity = 1;
        calculate();
    }

    BillCalculator(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        calculate();
    }

    void calculate() {
        totalCost = price * quantity;
        if (totalCost > 500) {
            finalAmount = totalCost - (totalCost * 10 / 100);
        } else {
            finalAmount = totalCost;
        }
    }

    int getTotalCost() {
        return totalCost;
    }

    int getFinalAmount() {
        return finalAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        BillCalculator bill;

        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            bill = new BillCalculator(p, q);
        } else {
            bill = new BillCalculator(p);
        }

        System.out.println(bill.getTotalCost());
        System.out.println(bill.getFinalAmount());
    }
}

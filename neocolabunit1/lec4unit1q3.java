// Single File Programming Question
// Problem Statement



// Lena is managing the ticketing system for an upcoming concert. She needs to provide a detailed summary of each ticket purchase. 



// Write a program that reads the concert name, seat number, ticket price, and ticket availability status, then displays these details in a formatted ticket summary.

// Input format :
// The first line of input consists of a string, representing the concert name.

// The second line consists of an integer, representing the seat number.

// The third line consists of a float value, representing the ticket price.

// The fourth line consists of a boolean value, representing the ticket availability status.

// Output format :
// The first line of output prints "Concert Name: " followed by a string representing the concert name.

// The second line of output prints "Seat Number: " followed by an integer representing the seat number.

// The third line of output prints "Ticket Price: " followed by a float value representing the ticket price rounded off to two decimal places.

// The fourth line of output prints "Available: " followed by a boolean value representing the ticket availability status.



// Refer to the sample output for the exact text and format.

// Code constraints :
// The given testcases fall under the following constraints:

// The concert name is a non-empty string.

// 1 ≤ seat ≤ 100

// 1.0 ≤ ticket price ≤ 1000.0

// Sample test cases :
// Input 1 :
// Summer Music Fest
// 12
// 59.99
// true
// Output 1 :
// Concert Name: Summer Music Fest
// Seat Number: 12
// Ticket Price: 59.99
// Available: true
// Input 2 :
// Marakuma Nenjam
// 34
// 75.50
// false
// Output 2 :
// Concert Name: Marakuma Nenjam
// Seat Number: 34
// Ticket Price: 75.50
// Available: false
// Note :


import java.util.Scanner;
public class Main {   
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);        
        String concertName = sc.nextLine();      
        int seatNumber = sc.nextInt();       
        float ticketPrice = sc.nextFloat();      
        boolean availability = sc.nextBoolean();           
        System.out.println("Concert Name: " + concertName);    
        System.out.println("Seat Number: " + seatNumber);     
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);      
        System.out.println("Available: " + availability);   
        }
    
}

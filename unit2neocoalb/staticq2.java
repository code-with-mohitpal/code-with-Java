// Single File Programming Question
// Problem Statement



// You are developing a chat application that supports efficient message storage and transmission. To achieve this, you need to implement message encoding and decoding.



// Encoding: When a user sends multiple messages, they are combined into a single encoded string by separating each message with the delimiter #.
// Decoding: When the encoded string is received, it is split back into individual messages using the same delimiter.


// Your task is to read the input string, perform encoding and decoding as required, and display the results in the specified format.

// Input format :
// The input consists of a single line of text.

// If the input contains multiple words separated by spaces, each word represents a separate message.
// If the input contains only one word, it represents a single message.
// Output format :
// The first line of output prints the encoded string in the format "Encoded: <encoded_string>"

// The second line prints "Decoded:"

// Each decoded message is printed on a new line.



// Refer to the sample output for format specifications.

// Code constraints :
// The given testcases fall under the following constraints:

// 0 ≤ Length of each message ≤ 100

// Input consists of printable characters only

// The delimiter used for encoding is #

// Sample test cases :
// Input 1 :
// Coding is fun
// Output 1 :
// Encoded: Coding#is#fun
// Decoded:
// Coding
// is
// fun
// Input 2 :
// Programming@123
// Output 2 :
// Encoded: Programming@123
// Decoded:
// Programming@123
// Note :

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] messages;
        
        if(input.trim().isEmpty()) {
            messages = new String[0];
        } else {
            messages = input.split(" ");
        }
        
        String encoded = String.join("#", messages);
        
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded:");
        
        if(encoded.isEmpty()) {
            System.out.println();
        } else {
            String[] decoded = encoded.split("#");
            for(String msg : decoded) {
                System.out.println(msg);
            }
        }
    }
}

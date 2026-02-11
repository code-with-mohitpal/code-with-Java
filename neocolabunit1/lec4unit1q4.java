// Single File Programming Question
// Problem Statement



// Ram is a data scientist who is preparing a report on AI model training for their team's daily meeting. He wants to create a program that reads the model's name, training epochs, batch size, learning rate, and whether the training was successful and then displays a formatted summary for the meeting.



// Can you assist Ram in this?

// Input format :
// The first line of input consists of a string representing the model's name.

// The second line of input consists of an integer representing the number of training epochs.

// The third line of input consists of an integer representing the batch size.

// The fourth line of input consists of a float value representing the learning rate.

// The fifth line of input consists of a boolean value representing the training success status.

// Output format :
// The first line of output prints "Model Name: " followed by the model name.

// The second line of output prints "Training Epochs: " followed by the number of training epochs.

// The third line of output prints "Batch Size: " followed by the batch size.

// The fourth line of output prints "Learning Rate: " followed by the learning rate rounded off to two decimal places.

// The fifth line of output prints "Training Successful: " followed by the training success status.



// Refer to the sample output for the exact text and format.

// Code constraints :
// The given testcases fall under the following constraints:

// The model's name is a non-empty string.

// 1 ≤ epoch, batch size ≤ 500

// 0.0 ≤ learning rate ≤ 10.0

// Sample test cases :
// Input 1 :
// GPT-4
// 100
// 64
// 2.567
// true
// Output 1 :
// Model Name: GPT-4
// Training Epochs: 100
// Batch Size: 64
// Learning Rate: 2.57
// Training Successful: true
// Input 2 :
// BERT
// 50
// 32
// 7.015
// false
// Output 2 :
// Model Name: BERT
// Training Epochs: 50
// Batch Size: 32
// Learning Rate: 7.01
// Training Successful: false
// Note :





import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);    
        String modelName = sc.nextLine();      
        int epochs = sc.nextInt();     
        int batchSize = sc.nextInt();      
        float learningRate = sc.nextFloat();     
        boolean success = sc.nextBoolean();   
        System.out.println("Model Name: " + modelName);    
        System.out.println("Training Epochs: " + epochs);    
        System.out.println("Batch Size: " + batchSize);    
        System.out.printf("Learning Rate: %.2f%n", learningRate);    
        System.out.println("Training Successful: " + success); 
        }
    
}

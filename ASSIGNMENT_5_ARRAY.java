
import java.util.Scanner;

public class Assign5_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] marks = new int[5];  // Declare an array of size 5
        int sum = 0;               // Initialize sum
        
        // Input marks
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];       // Add each mark to sum
        }
        
        // Calculate average
        double average = sum / 5.0;
        
        // Display result
        System.out.println("\nAverage Marks = " + average);
        
        sc.close();
    }
}

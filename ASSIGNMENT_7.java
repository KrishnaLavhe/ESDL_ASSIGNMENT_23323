
import java.util.Scanner;

public class Assign7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        int temp = originalNumber;
        int reversedNumber = 0;

        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;                   // Get the last digit
            reversedNumber = (reversedNumber * 10) + digit; // Build reversed number
            temp = temp / 10;                        // Remove the last digit
        }

        // Check for palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is Not a Palindrome Number.");
        }

        sc.close();
    }
}

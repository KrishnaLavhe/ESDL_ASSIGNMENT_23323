
import java.util.Scanner;

public class Assign10 {
    // Function to calculate Euler’s Totient φ(n)
    public static int eulerTotient(int n) {
        int result = n;  // Initialize result as n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;       // Remove all factors of i
                result -= result / i;
            }
        }
        if (n > 1)
            result -= result / n;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int count = eulerTotient(n);
        System.out.println("Count of numbers co-prime with " + n + " is: " + count);

        sc.close();
    }
}

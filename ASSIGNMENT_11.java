
import java.util.Scanner;

public class Assign11 {
    public static int longestSubarray(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0, maxLen = 0;

        while (right < arr.length) {
            sum += arr[right]; // expand window

            // shrink window until sum ≤ K
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (N): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        int result = longestSubarray(arr, k);
        System.out.println("Length of the longest subarray = " + result);

        sc.close();
    }
}

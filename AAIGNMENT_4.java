//Name-Aniket Chandrakant Joshi
//Roll no-23313
import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        float length = sc.nextFloat();
        System.out.println("Enter breadth");
        float breadth = sc.nextFloat();
        float area = length * breadth;

        System.out.println("Area of the rectangle: " + area);
    }
}

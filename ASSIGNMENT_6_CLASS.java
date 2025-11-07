import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    int marks;

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Assing6_Class {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.inputData();
        s1.displayResult();
    }
}

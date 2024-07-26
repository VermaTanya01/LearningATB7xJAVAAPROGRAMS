package exercise_14072024;

import java.util.Scanner;

public class LabEx016 {
    // Math class function largest of the 2 numbers
    // Math class function smallest of the 2 numbers

    public static void main(String[] args) {
        System.out.println("Please Enter any two numbers of your choice");
        Scanner s1= new Scanner(System.in);
        int i1 = s1.nextInt();

        Scanner s2= new Scanner(System.in);
        int i2 = s2.nextInt();

if (i1!=i2)
        {
            System.out.println("The maximum of the two numbers entered is:  " + Math.max(i1, i2));
            System.out.println("The minimum of the two numbers entered is:  " + Math.min(i1, i2));
        }
else {
    System.out.println("Both the numbers are equal. Please enter valid numbers.");
}
    }

}

package exercise_14072024;

import java.util.Scanner;

public class LabEx017 {
    public static void main(String[] args) {
        // functions for round, pow, cbrt, sqrt, ceil, floor

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number to calculate its round, floor, square root , cube root and ceiling values");
        float f = s.nextFloat();
        System.out.println("The round of the given number is:  "+Math.round(f));
        System.out.println("The floor value of the given number is:  "+Math.floor(f));
        System.out.println("The ceiling value of the given number is:  "+Math.ceil(f));
        System.out.println("The square root of the given number is:  "+Math.sqrt(f));
        System.out.println("The cube root of the given number is:  "+Math.cbrt(f));

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the BASE VALUE");
           double i= s1.nextDouble();

           Scanner s2= new Scanner(System.in);
        System.out.println("Please Enter the EXPONENTIAL VALUE");
        double i1= s1.nextDouble();

        System.out.println("The power of the given base number to its exponential is:  "+Math.pow(i, i1));

    }
}

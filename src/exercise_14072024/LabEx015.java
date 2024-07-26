package exercise_14072024;

import java.util.Scanner;

public class LabEx015 {
    //JAVA Math class functions
    public static void main(String[] args) {
        //integer value
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a number to print its absolute value");
        int i1= s1.nextInt();

        //float value
        Scanner s2= new Scanner(System.in);
        System.out.println("Enter a decimal number to print its absolute value");
        float i2= s2.nextFloat();

        System.out.println("The absolute value of the Input numbe is:  " +Math.abs(i1));
        System.out.println("The absolute value of the Input numbe is:  " +Math.abs(i2));
    }
}

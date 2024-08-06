package exercise_20072024;
import java.util.Scanner;
public class LabEx_026_LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter a year of your choice");
        double d1= s.nextDouble();

        if(d1>0) {

            if (d1 % 4 == 0 || d1 % 400==0 ) {
                System.out.println("The year entered is a leap year");
            }

            else {
                System.out.println("The year is not a leap year");
            }
        }
        else
        {
            System.out.println("This is not a valid year input. Please try again and Enter a valid year!!");
        }
    }
}

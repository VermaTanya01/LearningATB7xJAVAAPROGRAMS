package exercise_27072024;
import java.util.Scanner;
public class LabEx_063_Array_Average {
    public static void main(String[] args) {
        System.out.println("Please Enter the length of the array:   ");
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();

float avg[] =new float[length];
float average= 0.0f;
float sum=0.0f;
        for(int i=0; i<length; i++)
        {
            System.out.println("Enter the values in the array at index:  "+i);
            Scanner scan= new Scanner(System.in);
            avg[i]= scan.nextFloat();
            sum=sum+avg[i];
        }

average= sum/length;
        System.out.println("The average of the entered array values is:     "+average);
int int_avg=(int)average;
        System.out.println("The average value in integer format is:   "+int_avg);
    }
}

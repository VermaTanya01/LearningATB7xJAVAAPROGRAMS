package exercise_27072024;
import java.util.Scanner;
public class LabEx_062_Arrayunctions {
    public static void main(String[] args) {
//example of float array

        System.out.println("Please enter the length of the array:  ");
        Scanner sc1 =new Scanner(System.in);
        int length= sc1.nextInt();

        float arr[] = new float[length];

        float sum = 0.0f;

        for(int index=0; index<length; index++ )
        {
            System.out.println("Please Enter the value at the index:  "+index);
            Scanner sc = new Scanner(System.in);
            arr[index]= sc.nextFloat();

            sum = sum + arr[index];
        }

        System.out.println("The sum of all the values in the array is:  " +sum);
    }
}

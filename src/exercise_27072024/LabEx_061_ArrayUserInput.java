package exercise_27072024;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LabEx_061_ArrayUserInput {

    //Array USER INPUT!!

    public static void main(String[] args) {
        System.out.println("Please enter the length the Array: ");
        Scanner sc1= new Scanner(System.in);
        int j= sc1.nextInt();
        int [] marks = new int[j];

        for(int index=0; index<j; index++ )
        {
            System.out.println("Please enter the value at index: "  +index);
            Scanner sc = new Scanner(System.in);
             marks[index] = sc.nextInt();

        }

        for(int i=0; i<marks.length; i++)
        {
            System.out.println("The value of the array at index  "+i + "is  " +marks[i] );
        }
    }
}

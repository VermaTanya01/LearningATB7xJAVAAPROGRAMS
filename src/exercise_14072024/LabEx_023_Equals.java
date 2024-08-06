package exercise_14072024;
import java.util.Scanner;
public class LabEx_023_Equals {
    //equals()  contentEquals() equalsIgnorecase
    public static void main(String[] args) {
        System.out.println("Please enter any two strings of your choice");
        Scanner s1 = new Scanner(System.in);
        String str1=s1.next();

        Scanner s2 = new Scanner(System.in);
        String str2=s2.next();

        System.out.println("The result of equals() is:  "+str1.equals(str2));
        System.out.println("The result is equalsIgnorecase():  "+str1.equalsIgnoreCase(str2));
        System.out.println("The result of content equals() is:   "+str1.contentEquals(str2));




    }

}

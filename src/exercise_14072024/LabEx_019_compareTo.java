package exercise_14072024;
import java.util.Scanner;
public class LabEx_019_compareTo {
    public static void main(String[] args) {

        System.out.println("Please Enter any string of your choice");
        Scanner s1=new Scanner(System.in);
        String str=s1.next();

        System.out.println("Print another String of your choice");
        Scanner sc2= new Scanner(System.in);
        String str2=sc2.next();

        System.out.println("OUTPUT of First operation:  "+ str.compareTo(str2));
        System.out.println("OUTPUT of Second operation:  "+ str.compareToIgnoreCase(str2));
        System.out.println("The Append of the two Strings is as follows:  "+ str.concat(str2));

    }
}

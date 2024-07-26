package exercise_14072024;
import java.util.Scanner;
public class LabEx_isEmpty {
    public static void main(String[] args) {
        System.out.println("Please Enter a string.");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = String.valueOf(str1);

        if(str2.isEmpty()==true)
        {
            System.out.println("The String is empty");
        }
        else if(str2.isBlank()==true)
        {
            System.out.println("The String is blank");
        }
        else
        {
            System.out.println("Cant seem to identify the function used therefore returning the original string used:   "+str2);
        }
    }
}

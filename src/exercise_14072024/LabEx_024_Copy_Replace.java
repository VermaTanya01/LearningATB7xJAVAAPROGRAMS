package exercise_14072024;
import java.util.Scanner;
public class LabEx_024_Copy_Replace {
    //  join /matches/ replace /replace/all/ replace first / split
    public static void main(String[] args) {
        System.out.println("Enter two strings of your choice");
        Scanner s1 = new Scanner(System.in);
        String str1 = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        String str2 = s2.nextLine();
        //Join()

        // used with array    System.out.println("the result of join:  "+ str1.join(str2));

        //matches()
        System.out.println("The result of the matches() function is:  " + str1.matches(str2));

        //Replace
        System.out.println("The result of replace() is:  " + str1.replace('a', 'y'));
        System.out.println("The result of replace() is:  " + str1.replaceFirst("Hello", "**&&^^"));
        System.out.println("The result of replace() is:  " + str1.replaceAll("e", "++"));

        // used with arry:  System.out.println("The result of the split string is:  "+str1.split("bro"));
   //


    }

}

package exercise_14072024;

import java.util.Scanner;

public class LabEx_charAt {
    //Java String Methods
    public static void main(String[] args) {
        System.out.println("Please enter a String of your Choice");
        Scanner s1= new Scanner(System.in);
        String s2=s1.next();
        //System.out.println(s2);

        System.out.println("Enter the index value of the character you wish to know from 0 to last character of the String");
        Scanner sc= new Scanner(System.in);
        int i1= sc.nextInt();

        //charAt();
        System.out.println("The character at the specified Index is:  "+ s2.charAt(i1) );

        //codePointAt and codePointBefore

        System.out.println("Enter the index value you want to know the UNICODE of:  ");
        Scanner sc1= new Scanner(System.in);
        int i2 = sc1.nextInt();
        System.out.println("The UNICODE of the entered index is:  "+ s2.codePointAt(i2));
        System.out.println("The UNICODE of the char before the entered index is:  "+ s2.codePointBefore(i2));
    }

}

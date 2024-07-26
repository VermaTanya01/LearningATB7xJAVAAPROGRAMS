package exercise_14072024;

import java.util.Scanner;

public class LabEx_IndexOf {
    public static void main(String[] args) {
        //index of(), lastindexof(), length(), stratswith(), trim(), Vlaueof()

        System.out.println("Enter a string of your choice");
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        System.out.println("The index of character a is:   " +str1.indexOf('a'));
        System.out.println("The index of string abcdefg is:   " +str1.indexOf("abcdefg"));

        System.out.println("The last index of character a is:   " +str1.lastIndexOf('a'));
        System.out.println("The last index of string abcdefg is:   " +str1.indexOf("abcdefg"));

        System.out.println(str1.length());

        System.out.println(str1.startsWith("abc"));

        System.out.println(str1.trim()); //removes whitespaces

        System.out.println("Enter another string to know the function of ValueOf()");
Scanner sc1= new Scanner(System.in);
String str11 = sc1.next();
String str111= String.valueOf(str11);
        System.out.println(str111);

    }
}

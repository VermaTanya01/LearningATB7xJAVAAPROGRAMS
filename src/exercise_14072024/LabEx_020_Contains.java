package exercise_14072024;
import java.util.Scanner;
// cntains(), tiLowerClass() to Upper class() ends with(),
public class LabEx_020_Contains {
    public static void main(String[] args) {
//CONTAINS()
        System.out.println("Please enter a String of your choice to check the frequency of any letters........");
        Scanner sc= new Scanner(System.in);
        String str1= sc.next();
        String str2= str1.toLowerCase();
        System.out.println(str2.contains("JaiShreeHanumanJi"));

       //TO LOWERCASE()
        System.out.println("Please enter a string in any case");
        Scanner sc1 = new Scanner(System.in);
        String str3 = sc1.next();
        String str4= str3.toLowerCase();
        System.out.println("The entered string in lower case is:  "+str4);
//TO UPPERCASE()
        System.out.println("Please enter another string in any case, however you want");
        Scanner sc2= new Scanner(System.in);
        String str5=sc2.next();
        String str6=str5.toUpperCase();
        System.out.println("The entered string in Upper case is:  "+str6);

      // ends with()
        System.out.println("Please Enter the string of your choice");
        Scanner sc3= new Scanner(System.in);
        String str7= sc3.next();
        String str8= String.valueOf(str7.endsWith("p"));
        System.out.println(str8);
        //System.out.println(str7.endsWith("parallel"));


    }
}

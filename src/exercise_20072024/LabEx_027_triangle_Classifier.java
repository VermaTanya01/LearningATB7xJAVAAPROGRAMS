package exercise_20072024;

import java.util.Scanner;

public class LabEx_027_triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the first side of the triangle");
        int side_1= sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Please Enter the second side of the triangle");
        int side_2= sc1.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("Please Enter the third side of the triangle");
        int side_3= sc2.nextInt();
if(side_1>0 && side_2>0 && side_3>0)
{
    if (side_1 == side_2 && side_1 == side_3) {
        System.out.println("The triangle formed with the given sides is an EQUILATERAL TRIANGLE");
    }
    else if (side_1 != side_2 && side_2 != side_3 && side_3 != side_1)
    {
        System.out.println("The triangle formed with the given sides is an SCALENE TRIANGLE");
    }
    else
    {
        System.out.println("The triangle formed with the given sides is an ISOSCELES TRIANGLE");
    }
}
else {
    System.out.println("Please Enter a side with positive values");
}
    }
}

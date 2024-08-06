package exercise_27072024;
import java.util.Arrays;
import java.util.Scanner;
public class LabEx_064_ArrayMax {
    public static void main(String[] args) {
        System.out.println("Enter length------>");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        int max = 0;
        int min = 0;

        for (int index = 0; index < length; index++) {
            System.out.println("Please enter the value at the index----->" + index);
            Scanner scan = new Scanner(System.in);
            arr[index] = scan.nextInt();

        }

        Arrays.sort(arr);
        System.out.println("The maximum value is:  " +arr[length-1]);
        System.out.println("The minimum value is:   "+arr[0]);

        /*for(int index_1=0; index_1<arr.length-1; index_1++)
        {
            if (arr[index_1] >= arr[index_1 + 1]) {
                max= arr[index_1];
                min=arr[index_1 +1];
            }
            else
            {
                max= arr[index_1 + 1];
            }
        }

        System.out.println("The maximum value in the array is------>"+max);

        for(int m=0; m<arr.length-1; m++)
        {
            if(arr[m]< arr[m+1])
            {
                min=arr[m];
            }
            else {
                min=arr[m+1];
            }

        }
        System.out.println(" The minimum value is----->"+min);*/
    }
}

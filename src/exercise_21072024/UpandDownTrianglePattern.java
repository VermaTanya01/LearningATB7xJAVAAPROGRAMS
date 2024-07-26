package exercise_21072024;

public class UpandDownTrianglePattern {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<6; i++) {
            for(j=1; j<= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 6; i >= 1; i--) {
            System.out.print("");
            for (j = 1; j < i; j++) {
                System.out.print("* ");

            }System.out.println();
        }

    }
}

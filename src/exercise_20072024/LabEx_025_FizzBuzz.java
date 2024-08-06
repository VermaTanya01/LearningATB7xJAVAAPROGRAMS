package exercise_20072024;

public class LabEx_025_FizzBuzz {
    public static void main(String[] args) {
    for(int i=1; i<=100; i++)
    {
        if(i%3==0)
        {
            System.out.println("Fizz: mutiple of 3  " +i);
        }
        else if(i%5==0)
        {
            System.out.println("Buzz: multiple of 5  "+i);
        }
        else
        {
            System.out.println("FizzBuzz: multiple of neither two  "+i);
        }
    }
    }
}

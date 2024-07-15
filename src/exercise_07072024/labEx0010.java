package exercise_07072024;

import com.sun.security.jgss.GSSUtil;

// Examples of multiple MAIN methods in a single class
public class labEx0010 {
    public static void main(String[] args) {
        System.out.println("This is the main method");
    }
    static public void main(String ard)
    {
        System.out.println("This is the secondary main method");
    }
    public static void main(int [] args)
    {
        System.out.println("This is the third main method");
    }
}

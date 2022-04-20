import java.util.Scanner;
import java.util.*;
public class Main
{
public static void main(String[] args) {
ArrayList<String> nameStu = new ArrayList<String>();    
ArrayList<Integer> integers = new ArrayList<>();
            System.out.println("Enter the intergers: ");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println("The sum of the two numbers is: " + plus(x , y));
            System.out.println("The difference between the two numbers is: " + minus(x , y));
            System.out.println("The product the two numbers is: " + multiply(x , y));
            System.out.println("The ratio between the two numbers is: " + divide(x , y));
            System.out.println("The percentage the two numbers is: " + percent(x , y));
}
 public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (a * 1.0) / b;
    }

    public static double percent(int a, int b) {
        return (a * b * 1.0) / 100;
    }
}

import java.util.Scanner;
import java.util.*;
public class Main
{
public static void main(String[] args) {
ArrayList<String> nameStu = new ArrayList<String>();    
ArrayList<Integer> integers = new ArrayList<>();
ArrayList<Integer> integers1 = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int i;
            System.out.println("Enter the grade: ");
            for (i = 0; i < 10; i++) {
            integers.add(input.nextInt());                 
    }
    for (i = 0; i < 10; i++) {
    if (integers.get(i)%3 == 0) {
        integers1.add(integers.get(i));
    }
    }
    System.out.print("The intergers in the array divisable by 3 are: " + " ");
    printlist(integers1);
}

    public static void printlist (List<Integer> integers) {
        for (Integer x : integers)
        System.out.print(x + " ");
    }
}

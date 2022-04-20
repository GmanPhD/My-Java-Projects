import java.util.Scanner;
import java.util.*;
public class Main
{
public static void main(String[] args) {
ArrayList<String> nameStu = new ArrayList<String>();    
ArrayList<Integer> integers = new ArrayList<>();
    Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of the student: ");
            for (int i = 0; i < 10; i++){
            nameStu.add(input.next());
        }
         String maxSizeElement = nameStu.get(0);
             for (String element : nameStu) {
             if (element.length() > maxSizeElement.length()) {
                maxSizeElement = element;
            } 
             }
             System.out.println("The size of the arraylist is : " + nameStu.size());
            System.out.println("The list of names is: " + nameStu);
            System.out.println("The longest string in the arraylist is: " + maxSizeElement);
  }
}

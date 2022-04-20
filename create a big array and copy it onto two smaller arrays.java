import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{
public static void main(String[] args) throws Exception {
 BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array2[i] + " ");
        }
                                
    }
}

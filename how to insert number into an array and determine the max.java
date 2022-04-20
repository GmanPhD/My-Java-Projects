import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Maximum in an array

*/

public class Main
{
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();

        int max = max(array);
        System.out.println();
        System.out.println("The max integer of the array is: " + max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


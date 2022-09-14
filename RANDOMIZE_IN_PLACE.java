import java.util.*;
public class RANDOMIZE_IN_PLACE {
    //gets random integer
    public static int Random(int i, int n) {
        Random r = new Random();
        return r.nextInt(n - i) + i;
    }
    //prints array
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
    //gets random integer and swaps with array[i]
    public static void randomize(int[] array) {
        int n = array.length;
        for(int i=0; i<n; i++) {
            System.out.println("i: " + i);
            printArray(array);
            int num = Random(i,n);
            System.out.println("Random number: " + num);
            int tmp = array[i];
            array[i] = array[num];
            array[num] = tmp;
            printArray(array);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array = new int[10]; //declares array of size 10
        Random num = new Random();
        //initializes array with random integers 0-100
        for(int i=0; i<array.length; i++) {
            int tmp = num.nextInt(100);
            array[i] = tmp;
        }
        //prints out results
        System.out.print("Starting array: ");
        printArray(array);
        System.out.println();
        randomize(array);
        System.out.println();
        System.out.print("Final array: ");
        printArray(array);
        System.out.println();
    }
}
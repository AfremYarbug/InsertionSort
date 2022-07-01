package insertionsort;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = sc.nextInt(); 
        int[] array = new int[length]; //"
        for (int i = 0; i < array.length; i++) 
        { 
            System.out.print("Index " + i + ": "); 
            array[i] = sc.nextInt(); 
        }
        int cache;
        for (int a = 0; a < array.length; a++)
        {
            for (int s = 0; s < a; s++) 
            {
              
                if (array[a] < array[s]) {
                   ;
                    cache = array[a];
                    array[a] = array[s];
                    array[s] = cache;
                    
           
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

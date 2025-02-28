
import java.util.Scanner;

public class inputtoarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=input.nextInt();
        int[]arr = new int[size];

        System.out.println("Enter the Value");
        for(int i = 0; i<size; i++)
        {
            arr[i] = input.nextInt();
        }

        for (int i=0; i<size; i++) {
            System.out.println("The Values are: " + arr[i]);
            
        }

    }
}

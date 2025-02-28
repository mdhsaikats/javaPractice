import java.util.Scanner;
public class calculate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = input.nextInt();
        System.out.println("Enter the secound number");
        int b = input.nextInt();
        System.out.println("The Sum: " + (a+b));
    }
}

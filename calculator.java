import java.util.Scanner;

public class calculator {  
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first Number: ");
            int firstValue = scanner.nextInt();
            
            System.out.println("Enter second Number: ");
            int secondValue = scanner.nextInt();
            
            System.out.println("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0); // Fix: Read character input properly
            switch (operator) {
                case '+' ->                 {
                    int result = firstValue + secondValue;
                    System.out.println("Result: " + result);
                }
                case '-' ->                 {
                    int result = firstValue - secondValue;
                    System.out.println("Result: " + result);
                }
                case '*' ->                 {
                    int result = firstValue * secondValue;
                    System.out.println("Result: " + result);
                }
                case '/' -> {
                    if (secondValue == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        int result = firstValue / secondValue;
                        System.out.println("Result: " + result);
                    }
                }
                default -> System.out.println("Error! Invalid operator. Try Again.");
            }
        }
    }
}

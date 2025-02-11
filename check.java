import java.util.Scanner;
public class check {
    int y;
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter number");
        int y=input.nextInt();
        if(y > 0)
        {
            System.out.println("Number is Positive");
        }else if (y<0) {
            System.out.println("Number is Negative");
            
        }else{
            System.out.println("Number is Zero");
        }
            
        
    }
    
}

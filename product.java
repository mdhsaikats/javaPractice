import java.util.Scanner;

public class product{
    String productName;
    int price;
    int stockQuantity;
    public product(String productName, int price, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void purchaseProduct(int quantity){
        if(stockQuantity >= quantity)
        {
            stockQuantity = stockQuantity-quantity;
            int total = stockQuantity*price;
            System.out.println(total);

        }else{
            System.err.println("Insufficient stock available");
        }
    }
    public void displayProductDetails(){
        System.out.println("Product name:" + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock" + stockQuantity);
    }
    public static void main(String[] args) {
        product obj = new product("Laptop", 10000, 50);
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();
        obj.purchaseProduct(quantity);
        obj.displayProductDetails();   
    }
}
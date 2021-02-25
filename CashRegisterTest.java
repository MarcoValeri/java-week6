import java.util.Scanner;

public class CashRegisterTest {
    
    public static void main(String[] args) {

        // Create an instance (register 1) of CashRegister
        CashRegister r1 = new CashRegister();

        // Get items price by user input
        System.out.println("Please, insert the price of the first item:");
        Scanner input_price_one = new Scanner(System.in);
        double price_one = input_price_one.nextDouble();

        System.out.println("Please, insert the price of the second item:");
        Scanner input_price_two = new Scanner(System.in);
        double price_two = input_price_two.nextDouble();

        // add items to register 1
        r1.addItem(price_one);
        r1.addItem(price_two);

        // Use the CastRegister instance method getCount()
        System.out.println(r1.getCount());
        System.out.println(r1.getCount() == 2 ? "OK" : "FAIL");

        // Use the CashRegister instance method getTotal()
        System.out.printf("%.2f\n", r1.getTotal());
        System.out.println(r1.getTotal() == 4.94 ? "OK" : "FAIL");

    }

}

/**
   A simulated cash register.
 */
public class CashRegister {
    private int itemCount;
    private double totalPrice;

    public CashRegister() {
        this.itemCount = 0;
        this.totalPrice = 0;
    }
    
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }

    public void addItem(double price) {
        itemCount = itemCount + 1;
        totalPrice = totalPrice + price;
    }

    public double getTotal() {
        return totalPrice;
    }

    public int getCount() {
        return itemCount;
    }
    
} 
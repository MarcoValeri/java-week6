public class NewCashRegister {
    private double[] totalPrice;
    private int itemCount;

    public NewCashRegister(int capacity) {
        totalPrice = new double[capacity];
        itemCount = 0;
    }

    public void clear() {
        itemCount = 0;
    }

    public void addItem(double price) {

        if (price <= 0) {
            return;
        }

        // if (itemCount <= totalPrice.length) {
        //     return;
        // }

        totalPrice[itemCount] = price;
        itemCount++;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += totalPrice[i];
        }
        return total;
    }

    public int getCount() {
        return itemCount;
    }

    public void displayAll() {

        for (int i = 0; i < itemCount; i++) {
            System.out.println(totalPrice[i]);
        }
        
    }


}
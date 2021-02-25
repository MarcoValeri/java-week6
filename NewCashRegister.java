public class NewCashRegister {
    private double[] totalPrice;
    private int itemCount;

    public NewCashRegister() {
        this.itemCount = 0;
    }

    public void clear() {
    }

    public void addItem(double price) {
        itemCount = itemCount + 1;
        totalPrice[itemCount - 1] = price;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < totalPrice.length; i++) {
            total += totalPrice[i];
        }
        return total;
    }

    public int getCount() {
        return itemCount;
    }

}
public class NewCashRegisterTest {
    
    public static void main(String[] args) {
        
        NewCashRegister testOne = new NewCashRegister(5);
        testOne.addItem(5);
        testOne.addItem(14);
        testOne.addItem(90);
        testOne.addItem(23);
        testOne.addItem(59);
        System.out.println("Total: " + testOne.getTotal());
        testOne.displayAll();
    }

}

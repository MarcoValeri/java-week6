public class AddressTest {
    
    public static void main(String[] args) {

        // Create an obj
        Address home = new Address(7, "Gloucester Drive", "London", "N42LE");
        Address university = new Address(1, "Malet Street", "London", "WC1E 7HX");

        home.printAddress();
        System.out.println("\n");
        university.printAddress();

        if (home.comesBefore(university.getPostcode())) {
            System.out.println("University is too far than home");
        } else {
            System.out.println("Home is too far than university");
        }

    }

}

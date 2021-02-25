public class Address {
    private int houseNumber;
    private String street;
    private String city;
    private String postcode;

    public Address(int houseNumber, String street, String city, String postcode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void printAddress() {
        System.out.println(houseNumber + ", " + street);
        System.out.println(city + " - " + postcode);
    }

    public boolean comesBefore(String other) {

        if (postcode.compareTo(other) >= 0) {
            return true;
        } else {
            return false;
        }

    }

}

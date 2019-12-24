package pl.anna.lesson1.exercise;

public class Address {

    private String city;
    private String postCode;
    private String street;

    public Address(String city, String postCode, String street) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }
}

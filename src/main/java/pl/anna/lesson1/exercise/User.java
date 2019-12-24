package pl.anna.lesson1.exercise;

public class User {

    private String name;
    private Address address;
    private Features features;
    private ExpirationDate expirationDate;

    public User(String name, Address address, Features features, ExpirationDate expirationDate){
        this.name=name;
        this.address=address;
        this.features=features;
        this.expirationDate=expirationDate;
    }
    public User(String name, String city, String postCode, String street, String eyes, double height, String sex, String date){
        this.name=name;
        this.address=new Address(city,postCode,street);
        this.features=new Features(eyes, height, sex);
        this.expirationDate=new ExpirationDate(date);
    }
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Features getFeatures() {
        return features;
    }

    public String getAddressDetails() {
        return address.getCity()+address.getPostCode()+address.getStreet();
    }

    public String getFeaturesDetails() {
        return features.getEyes()+features.getHeight()+features.getSex();
    }

    public String getExpirationDate() {
        return expirationDate.getDate();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", features=" + features +
                ", expirationDate=" + expirationDate +
                '}';
    }
}

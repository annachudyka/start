package pl.anna.lesson1;

public class User {

    private String name;
    private Address address;

    public User(String name,Address address) {
        this.name = name;
        this.address=address;
    }
    public User(String name, String state, String city, String street){
        this.name=name;
        this.address=new Address(state,city,street);
    }

    public String getName() {
        return name;
    }

    public String getAddress(){

        return address.getState()+" "+address.getCity()+" "+" "+address.getStreet();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}

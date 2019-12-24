package pl.anna.lesson1.exercise;

public class Main {
    public static void main(String[] args) {

        String name1="Emil";
        User userOne=new User("Anna","Kraków","31-122","Francuska","blue",1.75,"female","2045");
        User userTwo=new User(name1,new Address("Wrocław","00-234","Wrocławska"),new Features("green",1.80,"male"),new ExpirationDate("2030"));

        User[] users=new User[]{userOne, userTwo};
        Identity identity=new Identity(users);
        System.out.println(userOne.getName()+userOne.getAddress()+userOne.getFeatures()+userOne.getExpirationDate());


    }
}
